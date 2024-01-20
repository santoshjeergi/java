package DesignPatterns.Adapter.PaymentGw;

public class RazorPay {

    void doPayment()
    {
        System.out.println("Razor payment");
    }

    void doCheckStatus(String id)
    {
        System.out.println("Razor check status for " + id);
    }
}
