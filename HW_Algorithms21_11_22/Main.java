package HW_Algorithms.HW_Algorithms21_11_22;

public class Main {
    public static void main(String[] args) {
     /*   todo First level: 1. Даны два целых числа x и n,
                напишите функцию для вычисления x^n
                 решение 1 - рекурсивно O(n)*/
    }
    public static long www(int x, int n) {
        long pow = 1L;
        for (int i = 0; i < n; i++) {
            pow = pow * x;
        }
        return pow;
    }
    {
        int x = 2;
        int n = 3;
        System.out.println(www(x, n));
    }
// todo:  решение 2 - улучшить решение 1 до O(lon n)
    static int power(int x, int y) {
        {
            int temp;
            if (y == 0)
                return 1;
            temp = power(x, y / 2);
            if (y % 2 == 0)
                return temp * temp;
            else
                return x * temp * temp;

        }
    }
}




