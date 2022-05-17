package day01datatypes;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        double Math, Physics, Chem, Eng, Hist, Music;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Math grade, please: ");
        Math = input.nextDouble();

        System.out.print("Enter your Physics grade, please: ");
        Physics = input.nextDouble();

        System.out.print("Enter your Chem grade, please: ");
        Chem = input.nextDouble();

        System.out.print("Enter your Eng grade, please: ");
        Eng = input.nextDouble();

        System.out.print("Enter your Hist grade, please: ");
        Hist = input.nextDouble();

        System.out.print("Enter your Music grade, please: ");
        Music = input.nextDouble();

        double sum = (Math + Physics + Chem + Eng + Hist + Music) / 6;
        System.out.print(sum);

    }
}

