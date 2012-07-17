package com.twu28.biblioteca;

public class SystemConsole implements Console{
    @Override
    public void println(String s) {
        System.out.println(s);
    }

    @Override
    public void println(int i) {
        System.out.println(i);
    }

    @Override
    public int getNumberFromConsole(){
        String input;
        int number;
        GetInput getInput=new GetInput();
        input= getInput.go();
        try{
            number=Integer.parseInt(input);  }
        catch (NumberFormatException string){
            System.out.println("Please enter a valid menu option(a number)");
            return 0;
        }

        return  number;
    }

    @Override
    public String getLine(int k){
        String input;
        GetInput getInput=new GetInput();
        input=getInput.go();
        return input;
    }


    public void clearConsole(){

    }
    public int getNumberFromConsole(int number)  {
        return (this.getNumberFromConsole());
    }
}
