import java.util.*;
 class Insertion_sort{
    public void sort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
public class Sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();

        }
        Insertion_sort Insertion_sort = new Insertion_sort();
        Insertion_sort.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}