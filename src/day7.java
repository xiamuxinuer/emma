public class day7 {
    public static void main(String[] args) {

        // increment  increasing value buy 1 in short cut using  ++

        int apple=10;
        apple=apple+1; //  11  just add 1
        apple+=1;      //12   just add 1
        ++apple;      //13  just add 1
        ++apple;      //14  just add 1
        apple++;      // 14 just add 1(when ++ comes from after variable,
                      // it will reflect the variable show up next time  )
        System.out.println(apple);// 15apple

        //  decrement  decreasing value by 1 in short cut using --
        int pear=10;
        pear=pear-1;   //decrease by 1
        pear-=1;    // decrease by 1
        --pear;   //  decrease by 1
        --pear;   //decrease by 1
        System.out.println(pear);

//  pre-post increment,and decrement(score++,score--)

  // more practice (one more ane one less )

        int score=50;
        System.out.println(score);  //50
        System.out.println(++score);  //51
        System.out.println(score++);  //51
        System.out.println(score);   //52
        System.out.println(--score);  //51
        System.out.println(score--);  //51
        System.out.println(score);  //50














    }


}
