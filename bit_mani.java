
public class bit_mani {

    public static void main (String args[]) {

        int n = 5;
        int pos = 2 ;// matlab 2 places se position left khiskani h 
        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("bit was zero");

        } else {
            System.out.println("bit was one ");
        }
    }











}