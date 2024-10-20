public class FindMissingNumber {
    static int missingNum(int[] arr){
        //If array contains "0" then take n = arr.length. Otherwise, take n = arr.length + 1.
        int n = arr.length;

        int expextedSum = n*(n+1)/2;

        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }

        int ans = expextedSum - actualSum;

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int result = missingNum(arr);
        System.out.println("The missing number is : " + result);
    }
}
