package br.com.meli.romannumbers.service;

/**
 * Este metodo nao está completo!
 * Tem como objetivo apenas atendar a pratica do spring
 * */

public class DecimalToRoman {
    public static String convertDecimalToRoman(int decimalNumber) {
//        int numberOfdigits = 0;
//        int result = decimalNumber;
//        int[] number = new int[numberOfdigits];
//
//        while (result % 10 > 0) {
//            result = decimalNumber % 10;
//            numberOfdigits++;
//        }


        switch (decimalNumber) {
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            default: return "";
        }

    }
}
