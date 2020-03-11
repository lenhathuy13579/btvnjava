import java.nio.channels.Pipe;
import java.util.Scanner;

public class hinh_tron {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        int r;
        double cVi, dTich;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();

        cVi = chuVi(r);
        dTich = dienTich(r);
        System.out.println("chu vi hình tròn: "+cVi);
        System.out.println("diện tích hình tròn: "+dTich);
    }
    public static double chuVi(int r)
    {
        return PI * 2 * r;
    }
    public static double dienTich(int r)
    {
        return PI * r * r;
    }
}
