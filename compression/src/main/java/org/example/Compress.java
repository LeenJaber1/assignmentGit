package org.example;

public class Compress {
    public String compressString(String word) {
        String computedString = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 1;
            while (i + 1 < word.length() && word.charAt(i) == word.charAt(i + 1) && count < 9) {
                count++;
                i++;
            }
            computedString += (count + "" + word.charAt(i));
        }
        return computedString;
    }
}
