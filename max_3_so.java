import java.util.Scanner;

public class max_3_so {
    public static int max3So(int a,int b,int c)
    {
        return (a>b)?((a>c)?a:c):((b>c)?b:c);
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập a: ");
        a = input.nextInt();
        System.out.print("nhập b: ");
        b = input.nextInt();
        System.out.print("nhập c: ");
        c = input.nextInt();
        System.out.println("số lớn nhất trong 3 số "+ a +" - "+ b +" - "+ c +" là: "+ max3So(a,b,c));
    }
}
