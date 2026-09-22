package Giai_Cuu_He_Thong_Ban_Ve_MegaCine;

public class main {
    public static void main(String[] args) {

        TicketPricingServiceRefactored refactored = new TicketPricingServiceRefactored();
        TicketPricingService legacy = new TicketPricingService();
        Object[][] testCases = {
                {-5, "Monday", false},
                {10, null, false},
                {20, "Tuesday", true},
                {10, "Monday", true},
                {10, "Monday", false},
                {65, "Friday", true},
                {30, "Saturday", true},
                {30, "Sunday", false},
                {30, "Monday", true},
                {30, "Monday", false},
        };
        System.out.println("So sanh Legacy vs Refactored");
        System.out.println("--------------------------------------------------------");
        int soCaDung = 0;
        for (Object[] tc : testCases) {
            int age = (int) tc[0];
            String ngay = (String) tc[1];
            boolean member = (boolean) tc[2];
            double giaLegacy = legacy.calculatePrice(age, ngay, member);
            double giaMoi = refactored.finalPrice(age, ngay, member);
            boolean khop = Double.compare(giaLegacy, giaMoi) == 0;
            if (khop) soCaDung++;
            System.out.printf("age=%-4d day=%-9s member=%-5b | Legacy=%-10.1f Refactored=%-10.1f %s%n",
                    age, ngay, member, giaLegacy, giaMoi, (khop ? "OK" : "SAI LECH"));
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Ket qua: " + soCaDung + "/" + testCases.length + " test case khop nhau.");
    }
}