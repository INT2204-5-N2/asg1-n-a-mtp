package xuly;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



public class IOFile {  
    public void ghiTu(TreeMap <String,String> list){
        Set<String> keySet = list.keySet();
        try (PrintWriter pw = new PrintWriter(new File("data1.DAT"))){           
            for(String i:keySet){
                pw.print(i);
                pw.println(" "+list.get(i));
            }
        } catch (Exception e) {
            System.out.println("got an exception 1");
        }
    }  
    public TreeMap<String,String> docTu(){
        TreeMap<String,String> list = new  TreeMap<>();
        try(Scanner sc = new Scanner(new File("data.DAT"))) {
            while(sc.hasNextLine()){               
                list.put(sc.next(),sc.nextLine().trim());
            }
        } catch (Exception e) {
            System.out.println("Got an exception 2");
        } 
        return  list;
    }   
}
