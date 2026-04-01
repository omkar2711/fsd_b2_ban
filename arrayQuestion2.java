public class arrayQuestion2 {
    public static void main(String[] args) {
        int arr[] = {12,4,56,78,90};
        int n = arr.length;

        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            if (arr[i] > maxEle){
                maxEle = arr[i];
            }

            if(arr[i] < minEle){
                minEle = arr[i];
            }
        }

        System.out.println("Maximum element is " + maxEle);
        System.out.println("Minimum element is " + minEle);

    }
}
