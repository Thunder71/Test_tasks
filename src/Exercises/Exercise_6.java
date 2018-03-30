package Exercises;

import java.util.Scanner;

public class Exercise_6 {
    public void solve(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание 6");
        System.out.println("Введите тест:");
        String ourText = in.nextLine();
        String res = "";
        for (int i = 0; i < ourText.length(); i++){
            char ch = ourText.charAt(i);
            if(!Character.isDigit(ch)){
                if(Character.isUpperCase(ch)){
                    ch = Character.toLowerCase(ch);
                }
                else {
                    if(Character.isLowerCase(ch)){
                        ch = Character.toUpperCase(ch);
                        res += ch;
                    }
                }
            }
        }
        System.out.println("Результат:");
        System.out.println(res);
    }

}
