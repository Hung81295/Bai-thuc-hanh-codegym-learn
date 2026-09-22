package ungDungDocSoThanhChu;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int soCanDoc = sc.nextInt();
        System.out.println(docSo(soCanDoc));
    }

    public static String docSo(int so) {
        if (so >= 0 && so < 10) {
            switch (so) {
                case 0:
                    return "zero";
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
            }
        } else if (so >= 10 && so < 20) {
            switch (so) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
            }
        } else if (so >= 20 && so < 100) {
            int hangChuc = so / 10;
            int hangDonVi = so % 10;
            String tenHangChuc = "";
            switch (hangChuc) {
                case 2:
                    tenHangChuc = "twenty";
                    break;
                case 3:
                    tenHangChuc = "thirty";
                    break;
                case 4:
                    tenHangChuc = "fourty";
                    break;
                case 5:
                    tenHangChuc = "fifty";
                    break;
                case 6:
                    tenHangChuc = "sixty";
                    break;
                case 7:
                    tenHangChuc = "seventy";
                    break;
                case 8:
                    tenHangChuc = "eighty";
                    break;
                case 9:
                    tenHangChuc = "ninety";
                    break;
            }
            if (hangDonVi == 0) {
                return tenHangChuc;
            } else {
                String tenDonVi = docSo(hangDonVi);
                return tenHangChuc + " " + tenDonVi;
            }
        } else if (so >= 100 && so < 1000) {
            int hangTram = so / 100;
            int phanConLai = so % 100;
            String tenHangTram = docSo(hangTram) + " hundred";
            if (phanConLai == 0) {
                return tenHangTram;
            } else {
                String phanSau = docSo(phanConLai);
                return tenHangTram + " " + phanSau;
            }
        }
        return "out of ability";
    }

}
