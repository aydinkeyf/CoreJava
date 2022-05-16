package day01datatypes;

import java.util.concurrent.SynchronousQueue;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
       //Starting from Int to boolean, they are primitive data types and start with lower case
       //32 bit long and Max 2,147,483,647 , Min -2,147,483,648
        int a = 5, b = 3, c = a + b;
        System.out.println(c);

        //64 bit long and between 4.9×10^-324 and 1.8×10^308
        double x = 8.134124, y = 7.4132412;
        System.out.println(x);

        //32 bit long and between 1.4×10^-45 and 3.4×10^38
        float myPie = 1.4f, yourPie = 2.4f;
        System.out.println(yourPie);

        //8 bit long and Max 127 , Min -128
        byte myByte = 25;
        System.out.println(myByte);

        // 16 bit long and Max 32,767 , Min -32,768
        short mShort = 1500;
        System.out.println(mShort);

        //64 bit long and Max 32,767 , Min -32,768
        long nLongA = 1234567890, nLongB = 9223372036854775807L;
        System.out.println(nLongB);

        //Unicode character set is used and all languages are included
        char nChar = 37, cChar = 'b';
        System.out.println(nChar);
        System.out.println(cChar);

        //Returns a Boolean value: true or false
        boolean right = true, wrong = false;
        int n1 = 8;
        int n2 = 4;
        System.out.println(right);
        System.out.println(wrong);
        System.out.println(n1 > n2);
        System.out.println(n2 < n1);
        System.out.println(n2 > n1);
        System.out.println(n1 == 8);
        System.out.println(n2 == 9);


        //'String' is a reference data type, that's why it is starting with uppercase
        String myFirstJavaStudy = "Merhaben Mukim";
        System.out.println(myFirstJavaStudy);

        /* Java operators: Arithmetic operators, Assignment operators
        Comparison operators, Logical operators, Bitwise operators */
        //Assignment operators
        int num3 = 11, num4 = 2; // "="
        num3 += 2; // "+="
        num3 *= 2; // "*="
        num3 /= 2; // "/="
        num3 &= 2; // "&="
        System.out.println(num3);

        //Arithmetic Operators
        int ab = 3, cd= 5, total = ab + cd;
        System.out.println(total);














    }
}
