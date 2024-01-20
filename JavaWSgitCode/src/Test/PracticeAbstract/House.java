package Test.PracticeAbstract;

public class House extends Building{

    @Override
    public void paint() {
        super.paint();
        System.out.println("painting house");
    }
}
