public class day7castingdatatypes {
    public static void main(String[] args) {
// casting data types:

        int num=10;
        double bigNum=num;

        System.out.println(num);
        System.out.println(bigNum);
       double num1=12.99d;
       int num2= (int) num1;

        System.out.println(num2);
//
       int num4= (int) 12.99;
       System.out.println(num4);
       //

        long lenth=100000L;
        int small= (int) lenth;
        System.out.println(small);

        float height=5.12f;
        int height1= (int) height;
        double height2=(double)height;
        double height3=(double)height1;
        System.out.println(height);
        System.out.println(height1);
        System.out.println(height2);
        System.out.println(height3);
























    }
}
