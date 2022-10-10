package UserInputFunctions;
import java.io.*;
public class BufferedReader02 {
    public static void main(String[] args)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        // let's take input from user until he says done
        String name = "";
        while (!name.equals("done")){
            System.out.println("Enter the names :");
            name = br.readLine();
            System.out.println("Name = "+name);
        }
        br.close();
        ir.close();
    }
}
