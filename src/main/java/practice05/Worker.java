package practice05;

public class Worker extends Person {
    String name = "";
    Integer age = 0;

    public Worker(String Pname, int Page) {
        super(Pname, Page);
        name = Pname;
        age = Page;
    }

    public String introduce() {
        String finalOutput2 = "My name is "+name+". I am "+age+" years old. I am a Worker. I have a job.";
        System.out.print(finalOutput2);
        return finalOutput2;
    }
}