package practice04;

public class Student extends Person {
    String name = "";
    Integer age = 0;
    Integer klass = 0;

    public Student(String Pname, int Page, int Klass) {
        super(Pname,Page);
        name = Pname;
        age = Page;
        klass = Klass;
    }

    public int getKlass()
    {
        return Student.this.klass;
    }



    public String introduce() {
        String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Student. I am at Class "+klass+".";
        System.out.print(finalOutput2);
        return finalOutput2;
    }
}