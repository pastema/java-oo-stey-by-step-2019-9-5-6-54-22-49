package practice11;

public class Klass {
    int klassNum = 0;
    int isLeader;
    String Tname = "";
    private Student mema;

    public Klass(int number) {
        klassNum = number;
    }

    public int getNumber() {
        return klassNum;
    }

    public String getDisplayName() {
        String output = "Class "+klassNum+"";
        return output;
    }

    public Student assignLeader(Student student) {
        if(student.klass.klassNum != getNumber())
        {
            System.out.print("It is not one of us.\n");
            return student;
        }
        else
        {
            System.out.print("I am "+Tname+". I know "+student.name+" become Leader of Class "+student.klass.klassNum+".\n");
            student.klass.isLeader = 1;
            return student;
        }
    }

    public Student appendMember(Student student) {
        System.out.print("I am "+Tname +". I know "+student.name+" has joined Class "+klassNum+".\n");
        student.klass.klassNum = klassNum;
        mema = student;
        return student;
    }

    public Student getLeader() {
        return mema;
    }
}