package Day63MapIntro;

import java.util.*;

public class MapPracticeMore {
    public static void main(String[] args) {

        Map<String, List<String>> groupInfo=new HashMap<>();


        List<String> names= new ArrayList<>(Arrays.asList("Serife","Muge","Alisa","Semra","Guvanch","Fatih","Ahmet"));

        groupInfo.put("bug hunter",names);

//or:
        groupInfo.put("power14",Arrays.asList("Abrehem","Emma","Maria"));
        groupInfo.put("technocrat",Arrays.asList("Akbar","Halik","Hajim","Lale"));

        System.out.println(groupInfo);
        System.out.println(groupInfo.get("power14").contains("Emma"));
     //groupInfo.get("technocrat").add("Nuran");


groupInfo.forEach((groupcode,allMembers)->System.out.println(groupcode + ":"+allMembers));

Set<String> groupName=groupInfo.keySet();
        System.out.println(groupName);
        Collection<List<String>> members=groupInfo.values();
        System.out.println(members);




// for single row
        // i want to get the value by it's column name
        // so i choose Map

        Map<String,String> row1 = new HashMap<>();
        row1.put("first_name", "Regan" );
        row1.put("email", "rboichat0@1688.com" );
        row1.put("gender", "Female" );

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "male" );

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>

        System.out.println(row1);
        System.out.println(row2);

       List<Map<String,String>>  rowMaplist=new ArrayList<>();
       rowMaplist.add(row1);
       rowMaplist.add(row2);

        System.out.println(rowMaplist);

        System.out.println(rowMaplist.get(1).get("email"));

rowMaplist.get(0).replace("first_name","Hulk");
        System.out.println(rowMaplist);
 rowMaplist.get(0).put("gender","male");
        System.out.println(rowMaplist);


        System.out.println("new thing added");

    }
}
