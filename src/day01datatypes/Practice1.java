package day01datatypes;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        int Math, Physics, Chem, Eng, Hist, Music;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Math grade, please: ");
        Math = input.nextInt();

        System.out.print("Enter your Physics grade, please: ");
        Physics = input.nextInt();

        System.out.print("Enter your Chem grade, please: ");
        Chem = input.nextInt();

        System.out.print("Enter your Eng grade, please: ");
        Eng = input.nextInt();

        System.out.print("Enter your Hist grade, please: ");
        Hist = input.nextInt();

        System.out.print("Enter your Music grade, please: ");
        Music = input.nextInt();

        int sum = (Math + Physics + Chem + Eng + Hist + Music) / 6;
        System.out.print(sum);

    }
}

