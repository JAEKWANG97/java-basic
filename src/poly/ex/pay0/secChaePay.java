package poly.ex.pay0;

public class secChaePay implements Pay {
    public boolean pay(int amount) {
        System.out.println("secChaePay 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}