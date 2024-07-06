package Introduction;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            try{
                long n = sc.nextLong();
                String s = " can be fitted in:";
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                {
                    System.out.println(n + s);
                    System.out.printf("%s\n%s\n%s\n%s\n", "* byte", "* short","* int", "* long");
                }
                else if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                {
                    System.out.println(n + s);
                    System.out.printf("%s\n%s\n%s\n", "* short","* int", "* long");
                }
                else if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                {
                    System.out.println(n + s);
                    System.out.printf("%s\n%s\n","* int", "* long");
                }
                else
                {
                    System.out.println(n + s);
                    System.out.printf("%s\n", "* long");
                }

            }
            catch(Exception e){
                String str = sc.next();
                System.out.println(str + " can't be fitted anywhere.");
            }
        }
    }
}
