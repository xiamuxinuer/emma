public class Day21Nestedloop {
    public static void main(String[] args) {

        for (int i = 1; i <=3; i++) {

            System.out.print("iteration "+i+" : " );
            for (int j = 1; j <=5; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }

//task:count 1 to 10 ,print only odd number,repeat it 4 times
        for (int x = 1; x <=4 ; x++) {
            System.out.print("iteration "+ x+":");
            for (int y = 1; y <=10; y++) {
                if (y % 2 == 0) {
                    System.out.print("   " + y + " - ");
                }
            }
            System.out.println();

        }

//task:
        for (int n = 1; n <=4; n++) {
            for (int s = 1; s<=4 ; s++) {
                System.out.print(s);
            }

            System.out.println();
        }


//task": number stair
        for (int z = 1; z <=5 ; z++) {
            System.out.print(z+" :");

            for (int j = z; j <=5 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
// backward :

        for (int z = 1; z <=5 ; z++) {
            System.out.print(z+" :");

            for (int j = 1; j <=z ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
