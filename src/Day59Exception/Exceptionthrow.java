package Day59Exception;

import java.io.FileNotFoundException;

public class Exceptionthrow {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }

        System.out.println("end");
    }




  public static void  readMyFile() throws FileNotFoundException {
      System.out.println("reading file");

      //throw  new FileNotFoundException("file not here");
  }







}
