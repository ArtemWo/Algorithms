package HW_Algorithms.HWA2022_11_01;

public class Main {
      //���� a>0 && b=1   -- ������ ������ �(n)
    //���� �=b -- ������ �(1)
    void method1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
   //��� 2
    //n/2 * n/2 * log_2(n)  --- ��������� �(n^2 * log(n))
    void method(int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) {
                    System.out.println("I am expert!");
                }
            }
        }
    }
    //��� 3
    void method3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }
}
