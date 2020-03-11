import java.util.Scanner;

public class fibonaci {
    public static int fibo(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        else
            return fibo(n-2) + fibo(n-1);
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
//        fibo(n);
        System.out.println("số fibonacci thứ "+n+" là: "+fibo(n));
    }
}
