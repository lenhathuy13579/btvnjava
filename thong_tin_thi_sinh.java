import java.util.Scanner;

public class thong_tin_thi_sinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ten, diaChi, soDienThoai;
        int tuoi;
        System.out.print("điền tên học sinh: ");
        ten = scanner.nextLine();
        System.out.print("điền tuổi học sinh: ");
        tuoi = Integer.valueOf(scanner.nextLine()); //  hoặc dùng scanner.nextInt() thì thêm 1 dòng
        System.out.print("điền địa chỉ học sinh: "); // scanner.nextLine()
        diaChi = scanner.nextLine();
        System.out.print("điền số điện thoại học sinh: ");
        soDienThoai = scanner.nextLine();
        System.out.println("tên: "+ten);
        System.out.println("tuổi: "+tuoi);
        System.out.println("địa chỉ: "+diaChi);
        System.out.println("SĐT: "+soDienThoai);
    }
}
