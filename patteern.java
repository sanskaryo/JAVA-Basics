public class patteern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // //outer lloop

        // for(int i =1; i<=n; i++) {

        //     //inner loop 
        //     for (int j=1;j<=m;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

            for (int j=1; j<=n;j++) {
                for(int i=1;i<=m;i++) {
                    if (i==1 || i==m || j==1 || j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    }
                }
                System.out.println();
            }
            


        // hollolw rectangle 


    }




