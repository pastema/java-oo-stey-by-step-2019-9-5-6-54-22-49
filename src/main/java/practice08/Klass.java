package practice08;

public class Klass {
    int klassNum = 0;
    int isLeader;
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

    public Student assignLeader(Student jerry) {
        isLeader = 1;
        mema = jerry;
        return jerry;
    }



    public Student getLeader() {
        return mema;
    }
}