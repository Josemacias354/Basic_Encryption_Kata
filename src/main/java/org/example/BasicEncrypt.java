package org.example;

public class BasicEncrypt {
    public String encrypt(String text, int rule) {
        String result = "";
        for (char c : text.toCharArray()) {
            int ascii = (int) c;
            ascii += rule;
            while (ascii > 255) {
                ascii -= 256;
            }
            result += (char) ascii;
        }
        return result;
    }  
}