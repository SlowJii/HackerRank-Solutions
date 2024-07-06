package Introduction;

import java.util.Scanner;

public class JavaLoopII {

    // Hàm tính lũy thừa của 2
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // số lượng bộ test case
        sc.nextLine();
        while (t-- > 0) {
            String[] str = sc.nextLine().trim().split("\\s+");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int n = Integer.parseInt(str[2]);
            int ans = a + power(2, 0) * b;
            System.out.print(ans + " ");
            for (int i = 1; i < n; i++) {
                ans += power(2, i) * b;
                System.out.print(ans + " ");
            }
            System.out.println(); // Xuống dòng sau mỗi test case
        }
        sc.close();
    }
}
