//import the java.io package
import java.io.*;

class buffer1 {

   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      //array
      float num[] = new float[8];

      System.out.println("Enter the string of values separated with spaces ");

          //split the string
      String[] val = br.readLine().split(" ");
      
      //parse individual values
      for (int i = 0; i < val.length; i++) {
         num[i] = Integer.parseInt(val[i]);
      }

      System.out.println("The values are ");

      //print
      for (int i = 0; i < val.length; i++) {
         System.out.println(num[i]);
      }
   }
}