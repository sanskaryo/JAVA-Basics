// Yeh program ek integer number ka ek specific bit update karne ke liye hai. Code mein do operations hain: bit ko set karna (1 banana) ya clear karna (0 banana).



public class updateBit  {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper =1 : set oper = 0 : clear
        int n = 5; // 0101
        int pos = 1;// matlab 2 places se position left khiskani h 
        int bitMask = 1 <<pos;
        if(oper == 1) {
            
// set operation

    int newnum  = bitMask | n; 
    System.out.println(newnum);
 

        } else {

            int newBitMask = ~(bitMask);
            int newnum =  newBitMask & n;
            System.out.println(newnum);
        }


        
    }











}