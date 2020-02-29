import java.util.Arrays;

public class Day28Arrayreview {
    public static void main(String[] args) {

int[] row1={1,2,3,4,5};
int[] row2={20,34,56,60};
int[] row3={10,25,65,80};
int[] row4={30,45,70,90};

int[][] excel={row1,row2,row3,row4};

        for (int i = 0; i <excel.length; i++) {
            for (int j = 0; j <excel[i].length; j++) {
                System.out.print(excel[i][j]+",");//1,2,3,4,5,20,34,56,60,10,25,65,80,30,45,70,90,

            }

        }
        System.out.println();

        for (int[] item:excel){

            for ( int eachItem:item){
                System.out.print(eachItem+",");//1,2,3,4,5,20,34,56,60,10,25,65,80,30,45,70,90,
            }
            System.out.println();
        }


        System.out.println(Arrays.deepToString(excel));//[[1, 2, 3, 4, 5], [20, 34, 56, 60], [10, 25, 65, 80], [30, 45, 70, 90]]

        System.out.println(Arrays.toString(excel[1]));//[20, 34, 56, 60]
        System.out.println(excel[3][1]);//   45

        System.out.println(excel.length);//  4 >> have 4 single dimensional  array
        System.out.println(excel[0].length);// 5  >>have 5 element in first single array


    }
}
