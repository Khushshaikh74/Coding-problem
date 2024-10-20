public class SecondLargestElement {
    static void secondLargestEle(int[] arr){
        int largestEle, secLargest;
        int n = arr.length;

        if(n < 2) {
            System.out.println("Array should contain atleast two element");
            return;
        }

        largestEle = secLargest = Integer.MIN_VALUE;    
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largestEle){
                largestEle = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != largestEle){
                secLargest = arr[i];
            }
        }    
        if(secLargest == Integer.MIN_VALUE)
            System.out.println("There is no largest value present in the array");
        else
            System.out.println("Second largest element is = " + secLargest);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,88,78,8};
        secondLargestEle(arr);
    }
}
