package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int numberA = Integer.parseInt(a, 2);
        int numberB = Integer.parseInt(b, 2);
        String sum = Integer.toBinaryString(numberA + numberB);
        return sum;
    }

    public String mult(String a, String b) {
        int numberA = Integer.parseInt(a, 2);
        int numberB = Integer.parseInt(b, 2);
        String mult = Integer.toBinaryString(numberA * numberB);
        return mult;
    }
}