package br.com.meli.morsecode.service;

/*
 * Algorithm font:
 * https://www.geeksforgeeks.org/java-program-to-convert-english-text-to-morse-code-and-vice-versa/
 * */


// Java program to demonstrate Morse code
public class GFG {
    // function to encode a alphabet as
    // Morse code
    public static String englishToMorse(String englishLang) {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };
        // Morse code by indexing
        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        System.out.print("Morse code of " + englishLang
                + " is ");
        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (englishLang.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
        return englishLang;
    }
}

// This code is contributed by Anant Agarwal.

