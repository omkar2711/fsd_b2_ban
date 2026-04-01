public class ArrayQuestion3 {


    public static void printArray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12,4,56,78,90};
        int n = arr.length;

        int i = 0;
        int j = n-1;

        System.out.println("Array Before: ");
        printArray(arr, n);

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Array After: ");
        printArray(arr, n);


        // for(int k = 0;k<n/2;k++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }



    }
}