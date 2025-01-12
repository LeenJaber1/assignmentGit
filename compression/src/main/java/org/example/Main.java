package org.example;

public class Main {
    public static void main(String[] args){

        Compress compress = new Compress();
        String word = "hhhhhhhwwwwwnnn";
        String compressedString = compress.compressString(word);
        System.out.println("Compressed String = "  + compressedString);
        System.out.println("Original String = " + word);
    }
}