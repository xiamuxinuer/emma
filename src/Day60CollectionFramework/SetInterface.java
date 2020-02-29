package Day60CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {


        Set<String> states=new HashSet<>();
states.addAll(Arrays.asList("DC","NY","OK","FL","CA","VA","FL","DC","NY"));

        System.out.println("how many state we have on the list? "+states.size());

states.remove("DC");

for (String each:states){
    System.out.println(each);
}


        System.out.println("-------------------------------");



        Iterator<String> stateIterator=states.iterator();


//while (stateIterator.hasNext()){
//    System.out.println(stateIterator.next());
//}

        while (stateIterator.hasNext()){

            String each=stateIterator.next();
            if (each.contains("A")){
                System.out.println("removing :"+ each);
                stateIterator.remove();
            }

        }

        System.out.println(states);



Set<Integer> nums=new LinkedHashSet<>();

nums.add(12);
nums.add(20);
nums.add(15);
nums.add(12);

        System.out.println(nums);



    }
}
