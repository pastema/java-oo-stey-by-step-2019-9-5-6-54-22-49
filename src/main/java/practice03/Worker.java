package practice03;

public class Worker extends Person {
    public Worker(String Pname, int Page) {
        super(Pname, Page);
    }


        public String introduce() {
        return "I am a Worker. I have a job.";
    }
}
