package Giai_Cuu_He_Thong_Ban_Ve_MegaCine;

public class TicketPricingServiceRefactored {
    public double finalPrice(int age, String dayOfWeek, boolean isMember) {
        double basePrice = 100000;
        double finalPrice = 0;
        if (age <= 0 || dayOfWeek == null || dayOfWeek.isBlank()) {
            return -1;
        }
        if (dayOfWeek.equalsIgnoreCase("Tuesday")) {
            finalPrice = basePrice * 0.5;
            return finalPrice;
        }
        return tinhGiaTheoDoTuoi(age, dayOfWeek,isMember);
    }

    public double tinhGiaTheoDoTuoi(int age, String dayOfWeek, boolean isMember) {
        double basePriceTuoi = 100000;
        double finalPrice = 0;
        if (age <= 0) {
            System.out.println("Tuổi không hợp lệ");
        }
        if (age <= 12) {
            if (isMember) {
                finalPrice = (basePriceTuoi * 0.7) - 10000;
                return finalPrice;
            } else {
                finalPrice = basePriceTuoi * 0.7;
                return finalPrice;
            }
        } else if (age >= 60) {
            finalPrice = (basePriceTuoi * 0.6);
            return finalPrice;
        } else {
            if (dayOfWeek.equalsIgnoreCase("Saturday")||dayOfWeek.equalsIgnoreCase("Sunday")) {
               if (isMember) {
                   finalPrice=(basePriceTuoi*1.2)*0.9;
                   return finalPrice;
               }else  {
                   finalPrice=basePriceTuoi*1.2;
                   return finalPrice;
               }

            }else {
                if (isMember){
                    finalPrice=basePriceTuoi*0.9;
                    return finalPrice;
                }else {
                    finalPrice=basePriceTuoi;
                    return finalPrice;
                }
            }

        }

    }

}