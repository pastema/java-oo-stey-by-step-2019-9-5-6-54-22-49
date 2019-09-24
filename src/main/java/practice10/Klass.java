package practice10;

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
        if(jerry.klass.klassNum != getNumber())
        {
            System.out.print("It is not one of us.\n");
            return jerry;
        }
        else
        {
            jerry.klass.isLeader = 1;
            return jerry;
        }
    }



    public Student appendMember(Student jerry) {
        mema = jerry;
        return jerry;
    }


    public Student getLeader() {

        return mema;
    }
}