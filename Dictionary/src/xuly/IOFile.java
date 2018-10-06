package xuly;
import java.io.File;
import java.io.PrintWriter;
import java.util.Set; 
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class IOFile {   
    public void ghiTu(TreeMap <String,String> list,String file_name){
        Set<String> keySet = list.keySet();
        try (PrintWriter pw = new PrintWriter(new File(file_name))){           
            for(String i:keySet){
                pw.print(i);
                pw.println("\t"+list.get(i));
            }
        } catch (Exception e) {
            System.out.println("got an exception 1");
        }
    }  
    public TreeMap<String,String> docTu(String file_name){
        TreeMap<String ,String> list = new  TreeMap<>();
        try(Scanner sc = new Scanner(new File( file_name))) {
            String s = sc.nextLine();
            while(sc.hasNext()){
                String[] s1= s.split("\\t",2);
                list.put(s1[0],s1[1]);
                s = sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Got an exception .2");
        } 
        return  list;
    }   
}
