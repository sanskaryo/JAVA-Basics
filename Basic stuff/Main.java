import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int space = 2*n-3;
		int star = 1;
		int row = 1;
        int val = 1;
		while(row<=n) {
			//number
			int i = 1;
            int p = val;
			while(i<=star) {
				System.out.print(p+" ");
				i++;
                p++;
			}
			//space
			int j = 1;
			while(j<= space) {
				System.out.print("  ");
				j++;
			}
			//number
			int k = 1;
			if (row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print((row-k+1)+" ");
				k++;
			}
			//Next Row Prep
			System.out.println();
			row++;
			space -= 2;
			star++;
		}
    }
} 