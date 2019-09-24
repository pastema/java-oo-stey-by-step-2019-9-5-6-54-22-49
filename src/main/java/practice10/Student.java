package practice10;

public class Student extends Person {
    String name = "";
    Integer age = 0;
    Klass klass;
    Integer Localid = 0;

    public Student(int id, String Pname, int Page, Klass Oklass) {
        super(id,Pname,Page);
        name = Pname;
        age = Page;
        klass = Oklass;
        Localid = id;
    }

    public Klass getKlass()
    {
        return klass;
    }



    public String introduce() {
        if(Student.this.klass.isLeader==0) {
            String finalOutput2 = "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass.klassNum + ".";
            System.out.print(finalOutput2);
            return finalOutput2;
        }
        else {
            String finalOutput2 = "My name is " + name + ". I am " + age + " years old. I am a Student. I am Leader of Class " + klass.klassNum + ".";
            System.out.print(finalOutput2);
            return finalOutput2;
        }
    }
}