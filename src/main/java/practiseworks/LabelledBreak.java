package practiseworks;   // package p1;

    //Labelled break example with while loop
    public class LabelledBreak {
        public static void main(String... ar) {
            int i = 7;
            loop1: while (i < 10) {
                for(int x=0;x<5;x++) {
                    System.out.println("x = "+x);
                    if(i==8) {
                        break loop1;
                    }
                }
                System.out.println("i =" + i);
                i++;
            }
            System.out.println("Out of the loop");
        } // main method ends

    } // class ends

