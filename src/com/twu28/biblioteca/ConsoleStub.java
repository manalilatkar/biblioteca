package com.twu28.biblioteca;
import java.util.ArrayList;
import java.util.List;


public class ConsoleStub implements Console {
    private final List<String> lines = new ArrayList<String>();

    public String getLine(int lineNumberOneBased) {
        return lines.get(lineNumberOneBased - 1);        //console to the test
    }

    public void giveNoToConsole(int userInput){          //test to console

        lines.add(""+userInput);
    }

    @Override
    public void println(String s) {                      //object to console
        lines.add(s);
    }

    public int getNumberFromConsole(){
        return (Integer.parseInt(lines.get(lines.size()-1)));
    }                                                   //console to object

    @Override
    public void println(int i) {
        lines.add(String.valueOf(i));
    }

    public void giveStringToConsole(String s) {
        lines.add(s);
    }
    public void clearConsole(){
        lines.clear();
    }
    public int getNumberFromConsole(int number){
        return (Integer.parseInt(lines.get(number-1)));
    }
}
