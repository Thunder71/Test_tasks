package Exercises;

import java.util.Scanner;

public class Exercise_5 {
    public void solve() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание 5");
        System.out.println("Введите слово полиндром английском:");
        String word = in.nextLine();
        if(Check_Polindrom(word)){
            System.out.println("Полиндром");
        }
        else {
            System.out.println("Не полиндром");
        }
    }

    private boolean Check_Polindrom(String word){
        int length = word.length();
        for (int i = 0; i < length/2; i++){
            if(word.charAt(i) != word.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
