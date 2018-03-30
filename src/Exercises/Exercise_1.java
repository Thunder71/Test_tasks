package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_1 {
    public void solve() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание 1");
        System.out.println("Введите число N");
        int N = in.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            int divs = 0;
            for (int j = 2; j < i; j++) {
                 if(i % j == 0){
                     divs++;
                     break;
                 }
            }
            if (divs == 0){
                mas.add(i);
            }
        }

        for (Integer integer : mas) {
            System.out.println(integer);
        }
    }
}
