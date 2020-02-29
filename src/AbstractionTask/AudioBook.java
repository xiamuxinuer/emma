package AbstractionTask;

public class AudioBook extends Book {
    double duration;


    public AudioBook(String name, String author,double duration) {
        super(name, author);
        this.duration=duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println(name+author+duration);
    }

    public void listen(){
        System.out.println("listing audio book");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("taking note from audio book");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("chapter 1 to chapter 10");
    }
}
////AudioBook
////	double duration
////	implement abstract method
////	instance method
////		listen()
////		toString()