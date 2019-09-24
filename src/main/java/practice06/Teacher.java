package practice06;

public class Teacher extends Person {
    String name = "";
    Integer age = 0;
    Integer klass = 0;
    public Teacher(String Pname, int Page) {
        super(Pname, Page);
        name = Pname;
        age = Page;
        klass = 0;
        }

    public Teacher(String Pname, int Page, int Klass) {
        super(Pname, Page);
        name = Pname;
        age = Page;
        klass = Klass;
    }

    public int getKlass() {
        return klass;
    }
//My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
    public String introduce() {
        if(this.klass == 0)
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
            return finalOutput2;
        }
        else
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class "+klass+".";
            return finalOutput2;
        }
    }

}
