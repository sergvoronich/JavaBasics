package Homework_12;

import java.io.File;

public class PrintFilesDirsInfo {

    public static void printFilesAndDirs(File dir) {
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    if (item.isHidden()) {
                        System.out.println(item.getName() + " - скрытая папка");
                    } else {
                        System.out.println(item.getName() + " - папка");
                    }
                } else {
                    if (item.isHidden()) {
                        System.out.println(item.getName() + " - скрытый файл");
                    } else {
                        System.out.println(item.getName() + " - файл");
                    }
                }
                printFilesAndDirs(item);
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("D:/Java/JavaBasics4");
        printFilesAndDirs(dir);
    }

}
