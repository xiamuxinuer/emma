package AbstractionTask;

import java.util.Arrays;
import java.util.List;

public class BookObjects {
    public static void main(String[] args) {
       Book b1=new PaperBook("java","akbar",5);
       Book b2=new AudioBook("jira","guljannet",3.5);
       b1.displayBookInfo();
       b2.showTableOfContent();
       b1.takeNote();
       b2.takeNote();



        List<Book> bookList= Arrays.asList(b1,b2);

        int paperBookCount=0;
        for (Book eachBook:bookList){
            if (eachBook.getClass().getSimpleName().equalsIgnoreCase("paperBook")){
                paperBookCount++;
            }
        }

        System.out.println(paperBookCount);



    }
}
////Create List<Book> add all your books
////	displayInfo on all of them
////	find out how many paperbook is there