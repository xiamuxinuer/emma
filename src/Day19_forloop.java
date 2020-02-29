public class Day19_forloop {
    public static void main(String[] args) {

      char myChar='A';
        System.out.println(myChar);
        System.out.println(++myChar);

for (char iChar='A';iChar<='Z';iChar++){
    System.out.print(iChar);
}

System.out.println("----------------");


   for (char kchar='Z';kchar>='A';kchar--){
       System.out.print(kchar);
   }
        System.out.println(" ");

//get the sum of number 1 to 10:
        int sum=0;
       for (int i=0;i<=15;i++){
           sum=sum +i;
       }
        System.out.println(sum);// put print statement outside of loop.
//       task:
        int count=0;

           for (int x=1;x<=100;x++){
       if (x % 15 == 0) {
           System.out.print(x+",");
          ++count;
       }
       }

        System.out.println("counter "+count);


//  how many 'a' do i have in my name ?
           String name="akbar";
           int coutofa=0;
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='a'){
                System.out.println("bingo");
                ++coutofa;
            }


        }

        System.out.println("countof a : "+coutofa);





    }
}
