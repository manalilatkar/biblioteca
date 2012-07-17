package com.twu28.biblioteca;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/17/12
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Console {
    void println(String s);

    void println(int i);

    int getNumberFromConsole();

    String getLine(int k);
    void clearConsole();
    int getNumberFromConsole(int number);
}