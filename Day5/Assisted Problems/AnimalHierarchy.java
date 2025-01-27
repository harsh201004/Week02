class Animal{
    String name;
    double age;

    Animal(String name,double age){
        this.name=name;
        this.age=age;
    }

    void displayDetails(){
        System.out.println("Name = " + this.name + " age = "+ this.age);
    }

    public void makeSound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    Dog(String name,double age){
        super(name,age);
    }
    
    public void makeSound(){
        System.out.println("Dog's Bark");
    }
}

class Cat extends Animal{
    Cat(String name,double age){
        super(name,age);
    }
    
    public void makeSound(){
        System.out.println("Cat's meow");
    }
}

class Bird extends Animal{
    Bird(String name,double age){
        super(name,age);
    }
    
    public void makeSound(){
        System.out.println("Bird's chrip");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal",10);
        animal.displayDetails();
        animal.makeSound();

        Dog dog = new Dog("Dog",3);
        dog.displayDetails();
        dog.makeSound();

        Cat cat = new Cat("Cat",1);
        cat.displayDetails();
        cat.makeSound();

        Bird bird = new Bird("Bird",1);
        bird.displayDetails();
        bird.makeSound();
    }
}
