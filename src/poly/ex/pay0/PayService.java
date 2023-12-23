package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        printPayStart(option, amount);
        Pay paySystem = PayStorage.findPay(option);
        boolean result = paySystem.pay(amount);
        printPayValidate(result);
    }

    private void printPayStart(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);
    }
    private void printPayValidate(boolean result) {
        if (result){
            System.out.println("결제 성공");
            return;
        }
        System.out.println("결제 실폐");
    }
}
