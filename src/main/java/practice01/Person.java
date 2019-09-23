package practice01;

public class Person {
   String name = "";
   Integer age = 0;

    public Person(String Pname, int Page) {
        name = Pname ;
        age = Page;
    }


    public String getName()
    {
        return "Tom";
    }


    public int getAge()
    {
        return 21;
    }

    public String introduce() {
        String finalOutput = "My name is "+ name+". I am "+age+" years old.";
        System.out.print(finalOutput);
        return finalOutput;
    }

}



