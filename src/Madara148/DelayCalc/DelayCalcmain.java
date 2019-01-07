package Madara148.DelayCalc;
import java.util.*;

public class DelayCalcmain {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean exit = false;


        do{

            try {
                System.out.println();
                System.out.println("Please type in BPM");
                System.out.println("please use integers or a number with a decimal");
                System.out.println("type : quit to exit");
                String bpm = input.nextLine();
                

                     if (bpm != null && bpm.isEmpty()) {

                    System.out.println("please make a choice");



                     }

                    else if ("quit".equals(bpm)) {
                        System.exit(0);
                        exit = true;
                    }
                    else {
                        try {
                            double dbpm = Double.parseDouble(bpm);


                            Triplets.Calc(dbpm);
                            Notes.Calc(dbpm);
                            Dotted.Calc(dbpm);


                           System.out.println("-----------------------------------------------------------------------------------");
                           System.out.printf("%1s %10s %30s %30s","     ", "Notes", "Dotted", "Triplets");                            
                           System.out.println();                                                                                      
                           System.out.println("-----------------------------------------------------------------------------------");
                           System.out.printf("%1s %10s %30s %30s","1    ", Notes.n1+"ms",Dotted.d1+"ms",Triplets.t1+"ms");
                           System.out.println();                                                                                      
                           System.out.printf("%1s %10s %30s %30s","1/2  ", Notes.n2+"ms",Dotted.d2+"ms",Triplets.t2+"ms");
                           System.out.println();                                                                                      
                           System.out.printf("%1s %10s %30s %30s","%.3d","1/4  ", Notes.n4+"ms",Dotted.d4+"ms",Triplets.t4+"ms");
                           System.out.println();                                                                                      
                           System.out.printf("%1s %10s %30s %30s","%.3d","1/8  ", Notes.n8+"ms",Dotted.d8+"ms",Triplets.t8+"ms");
                           System.out.println();                                                                                      
                           System.out.printf("%1s %10s %30s %30s","%.3d","1/16 ", Notes.n16+"ms",Dotted.d16+"ms",Triplets.t16+"ms");
                           System.out.println();
                           System.out.printf("%1s %10s %30s %30s","%.3d","1/32 ", Notes.n32+"ms",Dotted.d32+"ms",Triplets.t32+"ms");
                           System.out.println();
                           System.out.printf("%1s %10s %30s %30s","%.3d","1/64 ", Notes.n64+"ms",Dotted.d64+"ms",Triplets.t64+"ms");
                           System.out.println();
                           System.out.printf("%1s %10s %30s %30s","%.3d","1/128", Notes.n128+"ms",Dotted.d128+"ms",Triplets.t128+"ms");

                        }
                        catch (NumberFormatException parsetodouble34) {
                            System.out.println("failed to parse to double DelayCalcmain Line 34");
                        }




                    }




            }
            catch (InputMismatchException e){
                System.out.println();
                System.out.println("please enter a whole number, a number with a decimal value or type : quit to exit");
            }



        }
        while(!exit);





    }

}
