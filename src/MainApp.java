/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/14/12
 * Time: 1:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainApp {
    public static void main(String args[])   {
        SystemConsole systemConsole=new SystemConsole();
        Driver driver=new Driver();
        driver.start(systemConsole);

    }
}
