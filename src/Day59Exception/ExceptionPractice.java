package Day59Exception;

public class ExceptionPractice {
    public static void main(String[] args) {


       // NullPointerException e1=new NullPointerException();
        NullPointerException e2=new NullPointerException("java");

       // System.out.println(e1.getMessage());
        System.out.println(e2.getMessage());

        throw e2;











    }
}
