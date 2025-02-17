import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here

class MyBook extends Book {
    // Provide implementation for the abstract method
    @Override
    void setTitle(String s) {
        this.title = s; // Assign the title to the parent class field
    }
}

public class Abstract_class {

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}
