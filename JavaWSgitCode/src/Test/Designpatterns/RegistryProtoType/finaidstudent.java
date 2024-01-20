package Test.Designpatterns.RegistryProtoType;

public class finaidstudent extends Student implements Prototype {
    private int consession;

    public void setconsession( int c)
    {
        this.consession = c;
    }
    public int getconsession()
    {
        return consession;
    }



    finaidstudent(finaidstudent f)
    {
        super(f);
        this.setconsession(((finaidstudent)f).consession);
    }
    public finaidstudent clone() {
        finaidstudent f =  new finaidstudent(this);
        return f;
    }

    finaidstudent()
    {

    }
    @Override
    public String toString() {
        String sup = super.toString();
        return sup+ " finaidstudent{" +
                "consession=" + consession +
                '}';
    }
}
