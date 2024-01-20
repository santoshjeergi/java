package Test.solid;

public class client {
    public static void main(String[] args) {
        flyator f = new slowflyator();
        sparrow s = new sparrow(f);
        s.fly();

        s.setRef(new fastflyator());
        s.fly();
    }
}
