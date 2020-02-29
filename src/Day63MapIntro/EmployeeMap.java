package Day63MapIntro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMap {
    public static void main(String[] args) {

        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        Set<Map.Entry<String, String>> entryset=employeeMap.entrySet();
//get the name of all female employee:
for (Map.Entry<String, String> each:entryset){
    if (each.getValue().equalsIgnoreCase("female")){
        System.out.println(each.getKey());
    }
}


//update female to queen, male to king:


        for (Map.Entry<String, String> each:entryset){
            if (each.getValue().equalsIgnoreCase("female")){
                each.setValue("Queen");
            }
            else {
                each.setValue("KIng");
            }
            System.out.println(each);
        }







    }
}
