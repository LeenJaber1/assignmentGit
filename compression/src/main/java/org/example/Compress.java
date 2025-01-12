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
    public String decompressString(String compressedString) {
        String ogString = "";
        for(int i = 0 ; i < compressedString.length() ; i+=2){
            String number = String.valueOf(compressedString.charAt(i));
            int howMany = Integer.parseInt(number);
            ogString += String.valueOf(compressedString.charAt(i+1)).repeat(howMany);
        }
        return ogString;
    }

    public int getNumber(char character){
        String number = String.valueOf(character);
        return Integer.parseInt(number);
    }




    private boolean isNumber(char character){
        return character >= '1' && character<='9';
    }




    private boolean isLetter(char character){
        return character >= 'a' && character <= 'z';
    }


    public boolean isValid(String compressedString) {
        if(compressedString.length() % 2 != 0){
            return false;
        }
        for(int i = 0 ; i < compressedString.length() ; i+=2){
            if(!isNumber(compressedString.charAt(i))){
                return false;
            }
            if(!isLetter(compressedString.charAt(i + 1))){
                return false;
            }
        }
        return true;
    }
}
