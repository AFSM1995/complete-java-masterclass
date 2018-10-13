package com.company;

public class Main {

    public static void main(String[] args) {
        // long 64 bit
        long minlong = -9_223_372_036_854_775_808L;
        long maxlong = 9_223_372_036_854_775_807L;
        long longValue = (minlong/2);
        // int 32 bit
	    int minValue = -2_147_483_648;
	    int maxValue = 2_147_483_647;
	    int intValue = (minValue/2);
	    // short 16 bit
        short shortMinValue = -32_768;
        short shortMaxValue = 32_767;
        short shortValue = (short) (shortMinValue/2);
        // byte 8 bit
	    byte bitMinValue = -128;
	    byte bitMaxValue = 127;
	    byte byteValue = (byte) (bitMinValue/2); // casting to byte

        // Video exercise
        byte byteNumber = -100;
        short shortNumber = 6780;
        int intNumber = -2457983;
        long longNumber = (50000L + 10L) * (byteNumber + shortNumber + intNumber);
        short shorterNumber = (short) ((1000 + 10) * (byteNumber + shortNumber + intNumber));
        System.out.println(longNumber);
        System.out.println(shorterNumber);
    }
}
