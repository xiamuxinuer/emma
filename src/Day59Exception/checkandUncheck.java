package Day59Exception;

import java.io.IOException;

public class checkandUncheck {
    public static void main(String[] args) {


       String x="abc";
      //  System.out.println(x.charAt(50));


try{
    throw new RuntimeException("throw");
}catch (Exception e){
    System.out.println("caught");
}




    }

}
