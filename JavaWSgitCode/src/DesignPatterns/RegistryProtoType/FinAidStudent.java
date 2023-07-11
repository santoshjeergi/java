package DesignPatterns.RegistryProtoType;

public class FinAidStudent extends Student implements ProtoType{
    private int scolarship;

    public int getScolarship() {
        return scolarship;
    }

    public void setScolarship(int scolarship) {
        this.scolarship = scolarship;
    }

    //private FinAidStudent(FinAidStudent st)
    private FinAidStudent(Student st)
    {
        super(st);
        this.scolarship = ((FinAidStudent)st).scolarship;
    }

    public FinAidStudent()
    {

    }

  //  public FinAidStudent clone(FinAidStudent orig) {

        public FinAidStudent clone(Student orig) {

            FinAidStudent f = new FinAidStudent(orig);
        return f;
    }

    @Override
    public String toString() {
        super.toString();
        return "FinAidStudent{" +
                "scolarship=" + scolarship +
                '}';
    }
}
