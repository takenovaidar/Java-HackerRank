import java.util.*;

public class Static {

    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner console = new Scanner(System.in);
        B = console.nextInt();
        H = console.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        console.close();
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}


