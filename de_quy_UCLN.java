import java.util.Scanner;

public class de_quy_UCLN {
    public static int ucln(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return ucln(b, a % b);
        }
    }
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập hai số a và b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("ước chung lớn nhất của hai số "+ a +" và "+ b +" là: "+ ucln(a,b));
    }
}
