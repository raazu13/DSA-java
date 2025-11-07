import java.util.Arrays;

public class Multidimensional2D {
    public static void main(String[] args) {

        int[][] arr= new int[3][];

//        arr={{1,2,3},
//                {1,2,3},
//                {1,2,3}
//
//        };
        //this gives error either give input at each elemnts one by one or give it at initilization like below;

        int[][] arr2d = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}

        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr2d[i][j]);

            }
            System.out.println();

        }

    }
}
