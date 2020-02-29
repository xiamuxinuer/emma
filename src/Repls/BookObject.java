package Repls;

public class BookObject {
    public static void main(String[] args) {

        Book b1=new Book("java","akbar");
        Book b2=new Book("manual testing","guljannat");

        b1.addChapter("abstraction",100);
        System.out.println(b1.getTableOfContents());
        System.out.println(b1.getPage());









    }
}
