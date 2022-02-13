package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            //your code goes here

            // izejam cauri 3 mēnešiem
            for(int i = 1; i <= 3; i++){
                // izrēķinam preconetus un atlikumu pēc 1 mēneša
                int sum = amount - (amount / 10);

                //saglabājam atlikumu esošajā mainīgajā
                amount = sum;
            }
            System.out.println(amount);




    }
}
