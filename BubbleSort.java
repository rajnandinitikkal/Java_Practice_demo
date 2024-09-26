
public class BubbleSort {
    public static void main(String[] args){

        int arr[] = {10, 5,9,23,15,20,19};
        int length = arr.length;

        for(int i=0; i<length; i++){
            for(int j=1; j<length-i; j++){
                if(arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
