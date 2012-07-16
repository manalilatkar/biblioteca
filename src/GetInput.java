import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/14/12
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class GetInput {
    String userInput= null;
    public String go(){
        //This method takes input from the user and sends it to the main thread.

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


