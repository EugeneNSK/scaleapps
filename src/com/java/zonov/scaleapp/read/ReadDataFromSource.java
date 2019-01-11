package com.java.zonov.scaleapp.read;

import java.io.InputStream;
import java.util.Scanner;

public class ReadDataFromSource {

    public static String [] getData(InputStream is){
        Scanner sc = new Scanner(is);
        String str = sc.nextLine();
        sc.close();

        String [] data = str.split(" ");

        if (data.length <3){
            System.err.println("Not enough data for doMath operations");
            System.exit(2);
        }

        return data;
    }
}
