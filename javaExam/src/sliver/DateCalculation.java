package sliver;

import java.util.Scanner;

public class DateCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = 1,s= 1,m = 1;

        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int M = scanner.nextInt();

        for(int year = 1; ; year++) {

            if (e == E && s == S && m == M) {
                System.out.println(year);
                break;
            }

            e++;
            s++;
            m++;

            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
        }
    }
}
