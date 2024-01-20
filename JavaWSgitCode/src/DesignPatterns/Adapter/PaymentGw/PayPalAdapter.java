package DesignPatterns.Adapter.PaymentGw;

public class PayPalAdapter implements PaymentAdapter{

    PayPal p = new PayPal();
    @Override
    public void openCheckStatus(String id) {
        p.pCheckStatus(id);
    }

    @Override
    public void openpayment() {
        p.pPayment();
    }
}
