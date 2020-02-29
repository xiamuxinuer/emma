package Repls;

public class Book {
   String  title;
   String  author;
   String  tableOfContents="";
   int     nextPage=1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

//A method named addChapter that accepts two parameters.
// The first, of type String, is the title of the chapter;
// the second, is an integer containing the number of pages in the chapter.
// addChapter appends (that is concatenates)
//a newline followed by the chapter title followed by the string "..."
// followed by the value of the nextPage instance variable to the tableOfContents.
// The method also increases the value of nextPage by the number of pages in the chapter.

   public void  addChapter(String titleOfChapter,int pagesInChapter){
       tableOfContents += "\n" + titleOfChapter + "..." + nextPage;
       nextPage += pagesInChapter;

   }


//A method named getTableOfContents that accepts no parameters. getTableOfContents returns the values of the tableOfContents instance variable.

    public String getTableOfContents() {
        return tableOfContents;
    }

    //A method named getPages that accepts no parameters. getPages returns the number of pages in the book.

    public int getPage() {
        return nextPage-1;
    }

    //A method named toString that accepts no parameters. toString returns a String consisting of the value of title,
// followed by a newline character, followed by the value of author.
    @Override
    public String toString() {

        return title + "\n" + author;
    }
}







