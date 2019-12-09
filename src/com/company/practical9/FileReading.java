package com.company.practical9;

import java.io.*;

public class FileReading {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Tabassum Jahangir\\Desktop\\javaexp.txt");

        //Reading from file
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while((str = br.readLine()) != null){

            System.out.println(str);

        }

        String s = "How are you?";
        File f = new File("C:\\Users\\Tabassum Jahangir\\Desktop\\javaexp.txt");

        try {

            //Writing into file
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            bw.write(s);

            //closing the file
            bw.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
