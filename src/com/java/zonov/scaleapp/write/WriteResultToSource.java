package com.java.zonov.scaleapp.write;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class WriteResultToSource {

    public static void writeData(OutputStream os, int res){
        Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8);
        try {
            writer.append("Ответ: ").write(Integer.toString(res));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
