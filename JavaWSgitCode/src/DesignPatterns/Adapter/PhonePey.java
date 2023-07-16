package DesignPatterns.Adapter;

public class PhonePey {
    public static void main(String[] args) {

        OpenBank bankInterface = null ;

        /*This can be done by the depencency injection*/
        bankInterface = new YesAdapter();

       // bankInterface = new ICICIAdapter();
        bankInterface.credit(10);
        System.out.println(bankInterface.getBalance());
    }
}
