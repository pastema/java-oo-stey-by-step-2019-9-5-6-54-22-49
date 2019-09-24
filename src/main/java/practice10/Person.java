package practice10;

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
        if(object2 instanceof Person)
        {
            return getId() == person.Localid;
        }
        return false;
    }


    public String getName()
    {
        return Person.this.name;
    }

    public int getId()
    {
        return Person.this.Localid;
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