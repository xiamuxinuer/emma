package AbstractionTask.polimorphism;

import java.util.Arrays;
import java.util.List;

public class CapitalOne {
    public static void main(String[] args) {
        Tester t1=new Tester("emma","tester",60000);
        Tester t2=new Tester("dilida","tester",100000);

        Developer d1=new Developer("akbar",150000);
        Developer d2=new Developer("muhtar",120000);


       List<ScrumTeam> scrumTeamList= Arrays.asList(t1,t2,d1,d2);

        for (ScrumTeam each:scrumTeamList){
            each.employeeInfo();
        }



    }
}
//	create class capitalOne:
////			create List of Testers, and store two objects of Testers class
////			create List of Developers, and store two objects of Developers class
////			create List of ScrumTeam, and store the list of Testers and Developers
////			use for each loop to print out each of the scrum team member's EmployeeInfo