package Day63MapIntro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String> allData= Files.readAllLines(Paths.get("src/day63MapIntro/EmployeeData.txt"));

for (String eachLine:allData){
    System.out.println(eachLine);
}


        Map<Integer,String>  idNamePair=new HashMap<>();

for (String eachLine:allData){
    idNamePair.put(Integer.parseInt(eachLine.split(",")[0]),eachLine.split(",")[1]);
}

        System.out.println(idNamePair);




    }
}
