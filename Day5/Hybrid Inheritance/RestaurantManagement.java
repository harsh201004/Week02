class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface 
interface Worker {
    void performDuties();
}

// Subclass Chef inheriting from Person and implementing Worker
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    
    public void performDuties() {
        System.out.println(name + " is cooking.");
    }
}

// Subclass Waiter inheriting from Person and implementing Worker
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    
    public void performDuties() {
        System.out.println(name + " is serving food.");
    }
}

// Test the system
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("A", 1);
        Waiter waiter = new Waiter("B", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
