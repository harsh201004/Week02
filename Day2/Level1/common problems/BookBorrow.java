public class BookBorrow {
    String title;
    String author;
    double price;
    boolean availability;
    //parameterized constructor
    public BookBorrow(String title,String author, double price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;

    }
    //method to check the availability of book, if book is available then print borrowed else print not availabe
    public void checkborrow(){
        if(availability==true){
            availability=false;
            System.out.println("book borrowed");
        }else{
            System.out.println("book not available");
        }
    }
    //main method
    public static void main(String[] args) {
        BookBorrow b1=new BookBorrow("maths","anubhav",1000,true);
        b1.checkborrow();//print "book borrowed" as availability is true
        b1.checkborrow();//print "book not available" as availability is false
    }
}
