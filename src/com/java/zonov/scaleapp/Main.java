package com.java.zonov.scaleapp;

import com.java.zonov.scaleapp.math.MathOperations;
import com.java.zonov.scaleapp.read.ReadDataFromSource;
import com.java.zonov.scaleapp.write.WriteResultToSource;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.err.println("Not enough arguments");
            System.exit(2);
        }

        InputStream is = System.in;
        OutputStream os = System.out;

        try {
            if (!args[0].equals("-")) {
                is = new FileInputStream(new File(args[0]));
            }
        } catch (IOException e) {
            System.err.println("Some problems with file: " + args[0]);
            System.exit(2);
        }


        try {
            if (!args[1].equals("-")) {
                os = new FileOutputStream(new File(args[1]));
            }
        } catch (IOException e) {
            System.err.println("Some problems with file: " + args[1]);
            System.exit(2);
        }

        String[] data = ReadDataFromSource.getData(is);
        int result = MathOperations.doMath(data);
        WriteResultToSource.writeData(os, result);

        try {
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
