package day01datatypes;

import java.util.concurrent.SynchronousQueue;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
       //Starting from Int to boolean, they are primitive data types and start with lower case
        int a = 5, b = 3, c = a + b;
        System.out.println(c);

        double x = 8.134124, y = 7.4132412;
        System.out.println(x);

        float myPie = 1.4f, yourPie = 2.4f;
        System.out.println(yourPie);

        byte myByte = 25;
        System.out.println(myByte);

        short mShort = 1500;
        System.out.println(mShort);

        long nLongA = 1234567890, nLongB = 9223372036854775807L;
        System.out.println(nLongB);

        char nChar = 37, cChar = 'b';
        System.out.println(nChar);
        System.out.println(cChar);

        boolean right = true, wrong = false;
        System.out.println(right);
        System.out.println(wrong);

        //'String' is a reference data type, that's why it is starting with uppercase
        String myFirstJavaStudy = "Merhaben Mukim";
        System.out.println(myFirstJavaStudy);










    }
}
