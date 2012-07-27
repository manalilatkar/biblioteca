package com.twu28.biblioteca;

public class SystemConsole implements Console{
    @Override
    public void println(String s) {
        System.out.println(s);
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
            System.out.println("Select a valid option!!");
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


    public int getNumberFromConsole(int number)  {
        return (this.getNumberFromConsole());
    }
}
