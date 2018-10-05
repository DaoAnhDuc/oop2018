package week2.task1;
public class Task1 {
    public static int gcd(int a, int b) {
        if (a == 0 && b != 0)
            return b;
        else if (a != 0 && b == 0)
            return a;
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        if (n == 2 || n == 1)
            return 1;
        else if (n >= 3)
            return fibonacci(n - 1) + fibonacci(n - 2);
        else return 0;
        // TODO: Tìm số fibonacci ở vị trí n
    }

    public static void main(String[] args) {
        System.out.println(gcd(7, 9));
        System.out.println(fibonacci(5));
    }
}

