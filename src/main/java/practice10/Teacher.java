package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    String name = "";
    Integer age = 0;
    LinkedList<Klass> klass;
    Integer Localid = 0;
    public Teacher(int id,String Pname, int Page) {
        super(id,Pname, Page);
        name = Pname;
        age = Page;
    }

    public Teacher(int id,String Pname, int Page, LinkedList<Klass> Oklass) {
        super(id,Pname, Page);
        name = Pname;
        age = Page;
        klass = Oklass;
    }

    public Object getKlass() {
        return klass.toArray()[0];
    }

    public String introduce() {
        if(this.klass == null)
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
            return finalOutput2;
        }
        else
        {
            String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class ";
                for(int i = 0; i <= klass.size()-1;i++)
                {
                    finalOutput2 += klass.get(i).klassNum;
                    if(i != klass.size()-1)
                    {
                        finalOutput2 +=", ";
                    }
                    else
                    {
                        finalOutput2 += ".";
                    }
                }
                return finalOutput2;
        }
    }

    public String introduceWith(Student student) {
        for(int i = 0; i < klass.size(); i++){
            if(klass.get(i).getNumber() == student.getKlass().getNumber()){
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses(){
        return klass;
    }

    public boolean isTeaching(Student student) {
        boolean result = false;
        for(int i=0; i <= klass.size()-1; i++)
        {
            if(klass.get(i).klassNum == student.klass.klassNum)
            {
                result = true;
            }
        }

        return result;
    }
}