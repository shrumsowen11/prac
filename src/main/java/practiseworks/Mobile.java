package practiseworks;

interface Mobile {
    public void on();
    public void off();
    default public int battery() {
        return 100;
    }
}
 abstract class Samsung implements Mobile{

    @Override
    public void on() {
        System.out.println("Samsung is on....");
    }
    /*@Override
    public void off() {
        System.out.println("Samsung is off....");
    }*/
}
    abstract class S6 extends Samsung{
        @Override
        public void on() {
            System.out.println("Samsung is on...but sometimes problem.");
        }
    }
    class S extends S6 {
        @Override
        public void off() {
            System.out.println("Samsung is off....");
        }
        @Override
        public void on() {
            System.out.println("S is on...");
        }
    }
 class Upcasting {
    public static void main(String[] args) {
        /*Mobile mobile = new Samsung();
        mobile.on();*/

        System.out.println("$#####################$#$%#$%#$%");
        Samsung sam = new S();
        System.out.println("should print \"Samsung is on....\"");
        sam.on();
        System.out.println("$##############&&&&777#######$#$%#$%#$%");

        /*S6 s6 = new S6();
        Samsung s = (Samsung) s6;
        System.out.println("@#$!@#$!!@#$ down should be S6 upcasted to Samsung/ and Samung is off&&&&&&7&&&&&&(((**&^  ");
        s.on();
        s.off();*/

        System.out.println("@#$!@#$!!@#$ down should be S6 downcasted from Samsung/ and Samung is off&&&&&&7&&&&&&(((**&^  ");
        S6 s7 =(S6) sam;
        s7.on();
        s7.off();
        
    }
}
