public class Q04_BSorderAnatogonist {
    public static void main(String[] args) {

        int[] arr={-100,-1,0,1,2,3,4,5,6,8,9,10,100};
        int[] arr2={100,34,23,22,21,11,8,0,-1};

        System.out.println(index(arr2,23));
        System.out.println(index(arr,9));

    }
    static int index(int[] arr,int target ) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }

}
