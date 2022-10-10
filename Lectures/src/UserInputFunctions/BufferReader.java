package UserInputFunctions;
import java.io.*;
/* java brings various streams with it's I/O package that helps the user
 to perform all the input-output operations */
public class BufferReader {
    public static void main(String[] args)throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        // let's create BufferedReader object to convert bytes into input streams
        BufferedReader bfr = new BufferedReader(r);
        System.out.println("enter your name :");
        String name = bfr.readLine();
        System.out.println("welcome "+name);
    }
}
/*  Note : Buffered reader class may throw exceptions */
