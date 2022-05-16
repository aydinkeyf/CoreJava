package day01datatypes;

import java.util.concurrent.SynchronousQueue;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
       //Starting from Int to boolean, they are primitive data types and start with lower case
       //32 bit long and Max 2,147,483,647 , Min -2,147,483,648
        int a = 5, b = 3, c = a + b;
        System.out.println(c);

        double x = 8.134124, y = 7.4132412;
        System.out.println(x);

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
