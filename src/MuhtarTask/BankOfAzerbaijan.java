package MuhtarTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankOfAzerbaijan {
    public static void main(String[] args) {

       Developer d1=new Developer("emma",123,"developer") ;
        Developer d2=new Developer("akbar",124,"developer") ;
        Developer d3=new Developer("dildar",125,"developer") ;
        Developer d4=new Developer("hassan",126,"developer") ;
        Developer d5=new Developer("murat",127,"developer") ;

        List<Developer> developerList=new ArrayList<>(Arrays.asList(d1,d2,d3,d4,d5));


        Tester t1=new Tester("ryhan",100,"tester");
        Tester t2=new Tester("adil",101,"tester");
        Tester t3=new Tester("hakan",102,"tester");
        Tester t4=new Tester("abrahim",103,"tester");
        Tester t5=new Tester("muge",104,"tester");

        List<Tester> testerList=new ArrayList<>(Arrays.asList(t1,t2,t3,t4,t5));



        ScrumTeam s=new ScrumTeam(developerList,testerList);

        s.addNewTester(new Tester("sada",105,"tester"));
        s.addNewTester(new Tester("sarifa",106,"tester"));


for (Developer each:developerList){
    System.out.println(each);
}

for (Tester each:testerList){
    System.out.println(each);
}

    }
}
