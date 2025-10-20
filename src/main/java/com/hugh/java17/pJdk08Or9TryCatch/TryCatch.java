package com.hugh.java17.pJdk08Or9TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
        FileInputStream fos = new FileInputStream("");

        // jdk 9
        try(fis; fos){

        } catch(Exception e){

        }

    }
}
