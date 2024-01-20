package Test.solid;

public class sparrow extends Bird {
    public flyator ref;

    sparrow(flyator f)
    {
        this.ref = f;
    }

    public void setRef(flyator ref) {
        this.ref = ref;
    }

    void fly()
    {
        if(ref != null)
        {
            ref.fly();
        } else {
            System.out.println("unset-fly");
        }
    }

}
