package DesignPatterns.Adapter.PaymentGw;

public class RazorAdapter implements PaymentAdapter{

    RazorPay r = new RazorPay();

    @Override
    public void openpayment() {
        r.doPayment();
    }

    @Override
    public void openCheckStatus(String id) {
        r.doCheckStatus(id);
    }
}
