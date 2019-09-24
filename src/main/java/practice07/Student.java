package practice07;

public class Student extends Person {
    String name = "";
    Integer age = 0;
    Klass klass;

    public Student(String Pname, int Page, Klass Oklass) {
        super(Pname,Page);
        name = Pname;
        age = Page;
        klass = Oklass;
    }

    public Klass getKlass()
    {
        return klass;
    }



    public String introduce() {
        String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Student. I am at Class "+klass.klassNum+".";
        System.out.print(finalOutput2);
        return finalOutput2;
    }
}