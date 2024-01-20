package DesignPatterns.Adapter.PaymentGw;

public class Client {
    public static void main(String[] args) {
       /* PayPal p = new PayPal();  //Breaks OCP and SRP
        p.pCheckStatus("id1");
        p.pPayment();*/

        PaymentAdapter paymentAdapter = new RazorAdapter();
        paymentAdapter.openCheckStatus("30");
        paymentAdapter.openpayment();
    }
}
