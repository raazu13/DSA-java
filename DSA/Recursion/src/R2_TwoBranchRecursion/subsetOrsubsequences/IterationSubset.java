package R2_TwoBranchRecursion.subsetOrsubsequences;

import java.util.ArrayList;
import java.util.List;

public class IterationSubset {
    public static void main(String[] args) {
        int [] arr={1,2,3};

        int [] arrd={1,2,2};
        System.out.println(subsetDuplicate(arrd));


        System.out.println(subset(arr));


    }

    public static List<List<Integer>> subset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();  // this is the main list where we will keep all the subsets
           outer.add(new ArrayList<>());  // adding a empty list

        for(int num:arr){     // we will iterate through each element in the array and we will create a copy of lists addig it to all the list present in the outer list
            int size= outer.size();   // getting the number of list in outer list
            for(int i=0; i<size; i++){   // iterating through each list in the outer list
                List<Integer> inner = new ArrayList<>(outer.get(i));  //getting the ith list of outer list
                inner.add(num);   // adding the number in that list
                outer.add(inner);   // adding the list in the outer list
            }
        }

          return outer;  // returning the list
    }

    public static List<List<Integer>> subsetDuplicate(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();  // this is the main list where we will keep all the subsets
        outer.add(new ArrayList<>());  // adding a empty list

        int start=0;
        int end=0;
        for(int i=0; i<arr.length; i++){// we will iterate through each element in the array and we will create a copy of lists addig it to all the list present in the outer list
             start=0;
             if(i>0 && arr[i]==arr[i-1]){
                 start=end+1;
             }
             end=outer.size()-1;


            for(int j=start; j<=end; j++){   // iterating through each list in the outer list
                List<Integer> inner = new ArrayList<>(outer.get(j));  //getting the ith list of outer list
                inner.add(arr[i]);   // adding the number in that list
                outer.add(inner);   // adding the list in the outer list
            }
        }

        return outer;  // returning the list
    }


}
