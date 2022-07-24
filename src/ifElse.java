import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        /*
        Task
Given an integer,n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
Constraints
1<=n<=100;
         */
        //code
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n>=1 && n<=100)
        {
            if(n%2==0)
            {
                if( n<=5)
                    System.out.println("Not Weird");
                if(n>5 && n<=20)
                    System.out.println("Weird");
                if(n>20)
                    System.out.println("Not Weird");
            }
            else
                System.out.println("Weird");
        }

        scanner.close();
    }
}
