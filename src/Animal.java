public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("Hello, I'm animal, " + "my name is " + name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
