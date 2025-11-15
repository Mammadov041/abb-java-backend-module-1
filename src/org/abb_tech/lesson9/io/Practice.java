package org.abb_tech.lesson9.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.file.Files;

public class Practice {
    static void main(String [] args) {
        File file = new File("C:\\Users\\Asus\\OneDrive\\Рабочий стол\\testioJava.txt");

        try{
            // 1 byte system
            try(FileInputStream f = new FileInputStream(file)) {
                int data ;
                while( (data = f.read()) != -1 ){
                    System.out.print((char)data);
                }
            }

            try(FileOutputStream fos = new FileOutputStream(file)){
                fos.write("Salam necesen ? ".getBytes());
            }

            // 2 byte system
            try(FileReader fr = new FileReader(file)){
                int data;
                while( (data = fr.read()) != -1){
                    System.out.println((char)data);
                }
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

        // NIO
        try{
            System.out.println("==========NIO==========");
            var file2 = new File("io\\test.txt");
            var path = file2.toPath();
            Files.write(path,"Salam teze".getBytes());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
