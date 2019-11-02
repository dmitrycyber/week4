public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    public void speak(){
        System.out.println("Hello, I'm cat" + "my name is " + getName());
    }
}
