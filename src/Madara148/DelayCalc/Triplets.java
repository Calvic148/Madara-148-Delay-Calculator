package Madara148.DelayCalc;

import java.util.InputMismatchException;

/* 1000 milliseconds is 1 second
60.000 sixty thousand milliseconds divided by bpm example 120 = notes
note * 1.5 = doted
note * .667= triplets

 */
public class Triplets {


        public static double t1;
        public static double t2;
        public static double t4;
        public static double t8;
        public static double t16;
        public static double t32;
        public static double t64;
        public static double t128;

    public Triplets() {

    }


    public static void Calc(double dbpm) {

        try {
            t4 = (60000/dbpm) * .667;

            t2 = t4 * 2;
            t1 = t2 *2;

            t8 = t4/ 2;
            t16 = t8/ 2;
            t32 = t16/ 2;
            t64 = t32/ 2;
            t128 = t64/ 2;


        } catch (InputMismatchException triplets) {
            System.out.println("Triplets could not be calculate something went wrong");
        }
        //return 0;


    }



}
