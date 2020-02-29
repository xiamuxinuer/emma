package AbstractionTask;

public class PaperBook extends Book implements Readable {
    int weight;


    public PaperBook(String name, String author,int weight) {
        super(name, author);
        this.weight=weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println(name+author+weight);
    }


    @Override
    public void read(){
        System.out.println("reading paper book");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("taking note from paper book");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("chapter 1 to chapter 10");
    }
}
////PaperBook
////	int weight
////	-- add cosntructor to set all the fileds
////	implement abstract method
////	instance method
////		read()
////		toString()