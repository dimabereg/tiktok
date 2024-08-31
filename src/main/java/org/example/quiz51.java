package org.example;

public class quiz51 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");
        boolean result = str1.equals(str2) && str1 == str2;
        System.out.println(result);
    }
}
