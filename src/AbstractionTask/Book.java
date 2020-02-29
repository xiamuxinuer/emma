package AbstractionTask;

public abstract class Book implements KnowledgeBank {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();


}
//-- abstract
//Book
//	String name
//	String author
//-- add constructors to set the fields
//-- abstract void method
//	displayBookInfo()


//--- concreate
//PaperBook
//	int weight
//	-- add cosntructor to set all the fileds
//	implement abstract method
//	instance method
//		read()
//		toString()
//AudioBook
//	double duration
//	implement abstract method
//	instance method
//		listen()
//		toString()
//create an interface KnowledgeBank
//	abstract method takeNote();
//	default method showTableOfContent(){
//	}



//create anothe interface Readable
//	 abstract method read()



//Book implements KnowledgeBank
//AudioBook , Paperbook extends Book
//Paperbook implements Readable
//2:52


//Create List<Book> add all your books
//	displayInfo on all of them
//	find out how many paperbook is there