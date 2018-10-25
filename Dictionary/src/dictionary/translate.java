package dictionary;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 *
 * @author THE TESSEN
 */
public class translate {
    public static String translate(String langFrom, String langTo, String text) throws IOException {
        String urlStr = "https://script.google.com/macros/s/AKfycbxiQVsKyWiGXFDU8LeW-fi9KfS0ZIE01ovCpDUJkbJL0-3R6lw/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +"&target=" + langTo +"&source=" + langFrom;//Tham khảo stackoverflow                         
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        try (Scanner in = new Scanner(con.getInputStream(),"UTF-8")){
            while(in.hasNextLine()){
            response.append(in.nextLine());
            }
        }
        return response.toString();
    }
}
