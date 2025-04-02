import java.util.ArrayList;

public class RecLinearSearch {
    public static void main(String[] args) {
        int[] arr={4, 6, 8, 8 ,9, 50};
        
       System.out.println(findall(arr, 0, 8, new ArrayList<>()));
    }

   /*  static int search(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
           return search(arr, target,index+1);
        }*/

    static ArrayList<Integer> findall(int[] arr,int index,int target,ArrayList<Integer> list){

        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        return findall(arr, index+1,target, list);
    }

    }

