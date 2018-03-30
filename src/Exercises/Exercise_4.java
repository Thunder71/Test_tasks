package Exercises;

import java.util.Scanner;

public class Exercise_4 {
    public void solve(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание 4");
        System.out.println("Введите первое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе число:");
        int num2 = in.nextInt();
        int nod_Num = nod_func(num1,num2);
        System.out.println("НОД:");
        System.out.println(nod_Num);
        int noc_Num = noc_fun(num1,num2);
        System.out.println("НОK:");
        System.out.println(noc_Num);
    }

    private int nod_func(int num1, int num2){

        int n = num1 % num2;

        num1 = num2;

        num2 = n;

        if(n > 0){
            return nod_func(num1,num2);
        } else {
            return num1;
        }

    }

    private int noc_fun(int num1, int num2){
        int n;
        n = num1*num2/nod_func(num1,num2);
        return n;
    }
}
