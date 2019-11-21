public class Human {
    private String name;
    private int age;
    private String gender;

    public Human (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return String.format("Name: %s, Age: %s, gender: %s", this.name, this.age, this.gender);
    }

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println("Hello, I am human");
    }

}
