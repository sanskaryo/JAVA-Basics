import java.util.Scanner;

public class P {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int up = 0;
        
        while (up < n) {
           
            int star = up == 0 ?2* n - 1 : n - up;
            
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * up - 1; j++) {
                System.out.print(" ");
            }
            if (up != 0) {  
                for (int k = 0; k < star; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            up++;
        }
        
        int dp = n - 2;
        
        while (dp >= 0) {
      
            int star = dp == 0 ? 2*n - 1 : n - dp;
            
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * dp - 1; j++) {
                System.out.print(" ");
            }
            if (dp != 0) {  
                for (int k = 0; k < star; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            dp--;
        }
    }
}