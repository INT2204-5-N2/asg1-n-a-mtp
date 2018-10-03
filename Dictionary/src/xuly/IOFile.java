package xuly;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package controller;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



/**
 *
 * @author ThanTrieu@Pro
 */
public class IOFile {
    protected int count=0;

    
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
