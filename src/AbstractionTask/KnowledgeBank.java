package AbstractionTask;

public interface KnowledgeBank {


    public abstract void takeNote();


public default void showTableOfContent(){
    System.out.println("chapter 1 to chapter 10");
	}



}
//create an interface KnowledgeBank
////	abstract method takeNote();
////	default method showTableOfContent(){
////	}