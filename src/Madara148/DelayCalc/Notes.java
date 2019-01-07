package Madara148.DelayCalc;

import java.util.InputMismatchException;

/* 1000 milliseconds is 1 second
60.000 sixty thousand milliseconds divided by bpm example 120 = notes
note * 1.5 = doted
note * .667= triplets


 */
public class Notes {

        public static double n1;
        public static double n2;
        public static double n4;
        public static double n8;
        public static double n16;
        public static double n32;
        public static double n64;
        public static double n128;


    public Notes(){

    }

    public static void Calc(double dbpm) {

        try {
            n4 = 60000/dbpm;

            n2 = n4 * 2;
            n1 = n2 *2;

            n8 = n4/ 2;
            n16 = n8/ 2;
            n32 = n16/ 2;
            n64 = n32/ 2;
            n128 = n64/ 2;


        } catch (InputMismatchException Notes) {
            System.out.println("Notes could not be calculate something went wrong");
        }
       // return 0;




    }
}
