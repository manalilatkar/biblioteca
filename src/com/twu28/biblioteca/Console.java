package com.twu28.biblioteca;


public interface Console {
    void println(String s);

    void println(int i);

    int getNumberFromConsole();

    String getLine(int k);
    void clearConsole();
    int getNumberFromConsole(int number);
}