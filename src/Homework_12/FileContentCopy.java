package Homework_12;

import java.io.*;

public class FileContentCopy {

    public static void copier(File file) {
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("in.txt");
        copier(file);
    }
}
