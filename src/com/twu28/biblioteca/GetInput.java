package com.twu28.biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GetInput {
    String userInput= null;
    public String go(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            userInput= br.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
            System.exit(0);
        }
        return userInput;

    }


}


