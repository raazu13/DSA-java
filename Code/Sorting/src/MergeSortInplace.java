import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {

        int[] arr= {3,6,9,7,2,1};
        mergeInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeInplace(int[] arr,int start, int end){
        if(end-start==1){
            return;
        }

        int mid=start+(end-start)/2;

        mergeInplace(arr,start,mid);
        mergeInplace(arr,mid,end);

        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int s, int m, int e){
        int[] mix=new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        while(i<m&& j<e){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }else{
                mix[k++]=arr[j++];
            }
        }

        while(i<m){
            mix[k++]=arr[i++];
        }

        while(j<e){
            mix[k++]=arr[j++];
        }

        for (int l = 0; l < mix.length ; l++) {
            arr[s+l]=mix[l];

        }
    }
}
