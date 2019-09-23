package practice02;

public class Person {
    String name = "";
    Integer age = 0;

    public Person(String Pname, int Page) {
        name = Pname ;
        age = Page;
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
        String finalOutput1 = "My name is "+ name+". I am "+age+" years old.";
        System.out.print(finalOutput1);
        return finalOutput1;
    }
}
