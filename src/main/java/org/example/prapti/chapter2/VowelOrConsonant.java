package org.example.prapti.chapter2;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        char test = 'z';
        System.out.println("a :" + a + "e :" + e + "i :" + i + "o :" + 0 + "u " +u);
        if (test == a || test == e || test == i || test == o || test == u) {
            System.out.println("The character is vowel");
        } else System.out.println("The character is Consonant");

    }
}
