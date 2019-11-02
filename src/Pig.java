public class Pig extends Animal {
    public Pig(String name){
        super(name);
    }

    public void speak(){
        System.out.println("Hello, I'm pig" + "my name is " + getName());
    }
}
