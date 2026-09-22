package cuuVanHeThongViDienTuPayFails;


        /* HỆ THỐNG VÍ ĐIỆN TỬ - PAYFAILS (LEGACY CODE)
 * Vấn đề: Lỗi tràn bộ nhớ và lỗi toán tử với dữ liệu biên.
        */
public class WalletSystem {
    public static void main(String[] args) {
        System.out.println("--- GIAO DỊCH NẠP TIỀN ---");
        // BUG 1: Khách hàng có 2.147 tỷ, nạp thêm 1 triệu
        long currentBalance = 2147000000;
        long depositAmount = 1000000;

        // Toán tử + ở đây sẽ gây ra thảm họa
        long newBalance = currentBalance + depositAmount;
        System.out.println("Số dư sau khi nạp: " + newBalance + " VNĐ");

        System.out.println("\n--- THỐNG KÊ CHI TIÊU ---");
        // BUG 2: Người dùng mới tinh, chưa từng chi tiêu
        int totalSpent = 0;
        int transactionCount = 0;
        if(transactionCount<=0){
            System.out.println("Không thể chia cho không");
        }else {
            int averageSpent = totalSpent / transactionCount;
            System.out.println("Chi tiêu trung bình mỗi giao dịch: " + averageSpent + " VNĐ");
        }
        // Chương trình sẽ chết (crash) ngay tại dòng này
        System.out.println("Đoạn code này sẽ không bao giờ được in ra vì app đã sập!");
    }
}