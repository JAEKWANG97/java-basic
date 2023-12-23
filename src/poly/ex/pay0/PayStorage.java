package poly.ex.pay0;

public class PayStorage {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        }else if (option.equals("secChae")) {
            return new NewPay();
        }
        return new NonePay();
    }
}
