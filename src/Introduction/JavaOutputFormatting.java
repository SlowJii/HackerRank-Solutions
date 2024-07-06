package Introduction;


import java.util.*;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("================================");
        Scanner sc = new Scanner(System.in);
        int t = 3;
        while(t-- > 0)
        {
            String str = sc.next();
            int i = sc.nextInt();
            System.out.printf("%-15s%03d\n",str,i);

        }
        System.out.print("================================");
    }
}

