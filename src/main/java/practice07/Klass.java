package practice07;

public class Klass {
int klassNum = 0;
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
}
