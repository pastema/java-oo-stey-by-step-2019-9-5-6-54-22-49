package practice08;

public class Teacher extends Person {
    String name = "";
    Integer age = 0;
    Klass klass;
    Integer Localid = 0;
    public Teacher(int id,String Pname, int Page) {
        super(id,Pname, Page);
        name = Pname;
        age = Page;
    }

    public Teacher(int id,String Pname, int Page, Klass Oklass) {
        super(id,Pname, Page);
        name = Pname;
        age = Page;
        klass = Oklass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(this.klass == null)
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
            return finalOutput2;
        }
        else
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class "+klass.klassNum+".";
            return finalOutput2;
        }
    }
    //My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.
    public String introduceWith(Student jerry) {
        if(klass != jerry.klass)
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I don't teach "+jerry.name+".";
            return finalOutput2;
        }
        else
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+jerry.name+".";
            return finalOutput2;
        }
    }
}