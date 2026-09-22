package ungDungChuyenDoiTienTe;

import java.util.Scanner;

public class UsdDoiVnd {
    public static void main(String[] args) {
        long vnd;
        System.out.println("Nhập số tiền usd muốn chuyển đổi");
        Scanner sc = new Scanner(System.in);
        long usd = sc.nextLong();
        if (usd <= 0) {
            System.out.println("Số tiền không hợp lej nhập lại");
        } else {
            vnd = usd * 23000;
            System.out.println("Số tiền Việt sẽ tương đương là: "+vnd);
        }
    }
}
