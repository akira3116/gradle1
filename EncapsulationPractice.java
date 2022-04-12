
class Student
{
    private int rollno;
    private String sname;

    public int getRollno() {
        return rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}




public class EncapsulationPractice {

    public static void main(String[] args) {

        Student s = new Student();

        s.setRollno(55);
        int f =s.getRollno();
        System.out.println(f);

        s.setSname("Vamsi");
        String v = s.getSname();
        System.out.println(v);

    }
}
