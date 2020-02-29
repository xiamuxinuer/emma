package MuhtarTask;

import java.util.List;

public class ScrumTeam {

    List<Developer> devTeam;
    List<Tester> testersTeam;

    public ScrumTeam(List<Developer> devTeam, List<Tester> testersTeam) {
        this.devTeam = devTeam;
        this.testersTeam = testersTeam;
    }

    //  addnewTester(Tester tester): adds new tester to the List of testers

   public void addNewTester(Tester newTester) {
       testersTeam.add(newTester);
   }

//       addnewDeveloper(Developer): adds new developer to the list of developers

  public void addNewDeveloper(Developer newDeveloper){
       devTeam.add(newDeveloper);
  }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "devTeam=" + devTeam +
                ", testersTeam=" + testersTeam +
                '}';
    }
}
