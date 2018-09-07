import java.util.Scanner;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class SimpleDigit
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter limit: ");
         int limit = sc.nextInt();

         for(int i = 2; i<=limit; i++)
         {
             long f = round(sqrt(i));
             int res = 0;

             for(int j = 2; j<=f; j++)
             {
                 if ((i%j)==0)
                     res++;
             }
             if (res == 0)
                 System.out.println("sim_dig - "+i);
         }
    }
}
