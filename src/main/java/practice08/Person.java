package practice08;

public class Person {
    String name = "";
    Integer age = 0;
    Integer Localid = 0;


    public Person(int id, String Pname, int Page) {
        name = Pname;
        age = Page;
        Localid = id;
        equals(Person.this);
    }

    public boolean equals(Object object2) {
        Person person = (Person) object2;
        if(person.Localid == ((Person) object2).Localid)
        {
            return true;
        }
        else
        {
            return true;
        }
    }


    public String getName()
    {
        return Person.this.name;
    }


    public int getAge()
    {
        return Person.this.age;
    }


    public String introduce() {
        String finalOutput1 = "My name is "+ this.name+". I am "+this.age+" years old.";
        System.out.print(finalOutput1);
        return finalOutput1;
    }
}
