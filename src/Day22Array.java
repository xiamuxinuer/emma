public class Day22Array {
    public static void main(String[] args) {
//this array hold 4items inside
int [] score=new int[4];
score[0]=95;
score[1]=70;
score[2]=88;
score[3]=100;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);

        System.out.println(score.length);

        for (int i = 0; i <score.length ; i++) {
            System.out.println(score[i]);
        }
char[] ichar=new char[4];
   ichar[0]='e';
   ichar[1]='m';
   ichar[2]='m';
   ichar[3]='a';

            System.out.println(ichar);//---->>emma(only char array print out the exact value.)

        for (int x = 0; x <ichar.length; x++) {
            System.out.println(ichar[x]);
        }

boolean[] bools=new boolean[3];
 bools[0]=5>3;
 bools[1]=10<5;
 bools[2]=5==15;

        for (int y = 0; y <bools.length; y++) {
            System.out.println(bools[y]);
        }
  String[] name=new String[4];
 name[0]="akbar";
 name[1]="emma";
 name[2]="dildar";
 name[3]="queen";

        for (int n = 0; n <name.length; n++) {
            System.out.println(name[n]);
        }
        //reverse it : print it from the back
        for (int n = name.length-1; n>=0; n--) {
            System.out.println(name[n]);
        }

// string array practice:

        String[] movie={"game of throne","die heart"," friends" ,"law and order"} ;
        for (int i = 0; i <movie.length ; i++) {
            System.out.println("current show is: "+movie[i]+ " ,it has character:"+movie[i].length());
        }





    }
}
