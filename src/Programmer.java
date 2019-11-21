public class Programmer extends Human{

    private String programmingLangugage;

    public Programmer(String name, int age, String gender,  String programmingLangugage) {
        super(name, age, gender);
        this.programmingLangugage = programmingLangugage;
    }

    public void speak(){
        System.out.println("Hello, I am programmer");
    }
}
