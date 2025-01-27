public class Person {
    String name;
    int age;
    // default constructor
    public Person(){
        this.name="anubhav singh";
        this.age=21;
    }
    //parameterized constructor
    public Person(Person p1){
        this.name=p1.name;
        this.age=p1.age;
        System.out.println("name is : "+name+" age is: "+age);
    }
    //main method
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person(p1);
    }
}
