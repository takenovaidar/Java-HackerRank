import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lines_of_string {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner console = new Scanner(System.in);
        int LineNumber = 1;
        while (console.hasNextLine())
        {
            String string = console.nextLine();
            System.out.println(LineNumber+" "+string);
            LineNumber++;
        }
        console.close();
    }
}
