package Exercises;

import java.util.Scanner;

public class Exercise_2 {
    private int N = 0;

    public void solve() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание 2");
        System.out.println("Введите число N");
        N = in.nextInt();
        System.out.println(1);
        System.out.println(1);
        fibonacci(1, 1);
    }

    private void fibonacci(int fib1, int fib2) {
        int fib3 = fib1 + fib2;
        if (fib3 <= N) {
            System.out.println(fib3);
            fibonacci(fib2, fib3);
        }
    }
}
