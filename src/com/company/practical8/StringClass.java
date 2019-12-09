package com.company.practical8;

public class StringClass {

    public static void main(String[] args) {

        String s= "Tabassum";

        //To find string length
        System.out.println("String length = " + s.length());

        //To find a character at an index
        System.out.println("Character at 3rd index : " + s.charAt(3));

        //To find substring from index to end last char of string
        System.out.println("Substring : " + s.substring(3));

        //To find substring between offsets
        System.out.println("Substring  : " + s.substring(1,4));

        String s1 = "Tabassum ";
        String s2 = "Jahangir";

        //Concatenating two Strings
        System.out.println("Concatenated string  : " + s1.concat(s2));

        String word = "tabassuM";

        //To change from lower to upper characters
        System.out.println("Changing to UPPER Case : " + word.toUpperCase());

        String str1 = "txbxssum";
        System.out.println("Original String : " + str1);

        //Replacing character from another character
        String str2 = str1.replace('x' ,'a') ;
        System.out.println("Replaced x with a -> " + str2);

    }

}
