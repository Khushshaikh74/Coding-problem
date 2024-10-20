public class LargestElement{
    static int largestEle(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,8,9};
        int ans = largestEle(arr);
        System.out.println("Largest element is: " + ans);
    }
}