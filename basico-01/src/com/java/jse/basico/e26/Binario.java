package com.java.jse.basico.e26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Binario {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("img.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("img_copia.png"));

        byte[] buffer = new byte[1024];

        int bytesLeidos = 0;

        while ((bytesLeidos = bis.read(buffer)) > 0){
            bos.write(buffer, 0, bytesLeidos);
        }

        bos.close();
        bis.close();
    }
}
