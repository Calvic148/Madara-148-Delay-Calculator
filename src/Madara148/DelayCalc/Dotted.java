package Madara148.DelayCalc;

import java.util.InputMismatchException;

/* 1000 milliseconds is 1 second
60.000 sixty thousand milliseconds divided by bpm example 120 = notes
note * 1.5 = doted
note * .667= triplets



 */
public class Dotted {



        public static double d1;
        public static double d2;
        public static double d4;
        public static double d8;
        public static double d16;
        public static double d32;
        public static double d64;
        public static double d128;

    public Dotted (){

    }


    public static void Calc(double dbpm) {

        try {
            d4 = (60000/dbpm) * 1.5;

            d2 = d4 * 2;
            d1 = d2 *2;

            d8 = d4 / 2;
            d16 = d8 / 2;
            d32 = d16 / 2;
            d64 = d32 / 2;
            d128 = d64 / 2;


        } catch (InputMismatchException dotted) {
            System.out.println("Dotted could not be calculate something went wrong");
        }
        //return 0;


    }
}
