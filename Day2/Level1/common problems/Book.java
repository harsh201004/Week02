public class Book {

    String title;
    String author;
    double price;
    //default constructor
    public Book(){

        System.out.println("default constructor called");
        this.title="unknown title";
        this.author="unknown author";
        this.price=0.0;
    }
    //parameterized constructor
    public Book(String title,String author, double price){
        System.out.println("parameterized constructor called");
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //main method
    public static void main(String[] args) {
        Book b1=new Book();//call the default constructor
        Book b2=new Book("maths","anubhav",300.0);//call the parameterized constructor
    }
}
