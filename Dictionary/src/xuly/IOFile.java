package xuly;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class IOFile {   
    public void ghiTu(TreeMap <String,String> list,String file_name) {
        Set<String> keySet = list.keySet();
        try(BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(
    new FileOutputStream(file_name), "UTF-8"))){           
            for(String i:keySet){
                pw.write(i);
                pw.write("\t"+list.get(i)+"\n");    
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("got an exception 1");
        }
    }  
    public TreeMap<String,String> docTu(String file_name)  {
        TreeMap<String ,String> list = new  TreeMap<>();
        File f=new File(file_name);
        try(Scanner sc = new Scanner(f, "UTF-8")) {
            String s = sc.nextLine();
            while(sc.hasNext()){
                String[] s1= s.split("\\t",2);
                list.put(s1[0],s1[1]);
                s = sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
           // printStackTrace();
        } 
        return  list;
    }   
}