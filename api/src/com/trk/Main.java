package com.trk;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// C:\Users\Evam_\IdeaProjects\api a.txt
        File file = new File("a.txt"); // dosya
        try        {
                FileReader fileReader
                    = new FileReader(file);
            char b = (char)fileReader.read(); // cast to char
            int c =fileReader.read();
            while(c !=-1) { //-1 read dosyanın sonuna geldi demek
                char k = (char)c;
                System.out.print(k + " ");
                c=fileReader.read();
                //System.out.print(c + " ");
            }// içini ASCII karakter olarak basar

            fileReader.close();
            file = new File("a.txt");

            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(file));
            System.out.println("\n" + bufferedReader.readLine());
            bufferedReader.close();
            fileReader.close();

            File output = new File("output.txt");
            FileWriter fileWriter
                    = new FileWriter(output);
            fileWriter.write("deneme mesaj"); //output dosyasi olusur
            fileWriter.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
