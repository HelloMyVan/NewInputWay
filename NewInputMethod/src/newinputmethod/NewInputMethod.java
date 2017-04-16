/*
 * 新的输入方式，但是必须使用try和catch，而且没能输出异常，因为没有测试出异常，以后再学习。
 */
package newinputmethod;
import java.io.*;

/**
 *
 * @author fsl97
 */
public class NewInputMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String words = " ";
        InputStreamReader getLine = new InputStreamReader(System.in);
        BufferedReader buffIn = new BufferedReader(getLine);
        try
        {
            words = buffIn.readLine();
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        System.out.println(words);
    }
    
}
