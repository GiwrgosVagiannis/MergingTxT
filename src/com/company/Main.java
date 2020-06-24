package com.company;


import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> LinesOfTheTXTFiles = new ArrayList<String>();
        File folder = new File("C:\\Users\\giwrg\\Desktop\\RF");
        //folder h Variable gia na parw to path apo ta txt pou tha traviksw//
        File[] listOfFiles = folder.listFiles();
        //listofFiles ola ta arxeia mou se mia lista//
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];

            BufferedReader br = new BufferedReader(new FileReader(file));

            String lineofTXT;
            while ((lineofTXT = br.readLine()) != null) {

                LinesOfTheTXTFiles.add(lineofTXT+"|"+file.getName());
            }


        }
        for(int i=0;i<LinesOfTheTXTFiles.size();i++){
            System.out.println(LinesOfTheTXTFiles.get(i));
        }
        System.out.println(LinesOfTheTXTFiles.size());
        System.out.println(listOfFiles.length);

        printArrayListToFile(LinesOfTheTXTFiles, "output.txt");



        }
    public static void printArrayListToFile(ArrayList<String> arrayList, String filename) throws IOException {
        PrintWriter writer = new PrintWriter(filename);
        for (String line : arrayList) {
            writer.println(line);
        }
        writer.close();
    }

}




