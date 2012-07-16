/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Console {
    void println(String s);

    void println(int i);

    int getNumberFromConsole();
    
    String getLine(int k);
}
