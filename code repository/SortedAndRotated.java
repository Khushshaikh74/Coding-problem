public class SortedAndRotated {
    static boolean checkSortedAndRotated(int[] arr){
        int n = arr.length;
        int ascCnt = 0;
        int descCnt = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > arr[(i + 1) % n])
                ascCnt++;
        }

        for(int i = 0; i < n; i++){
            if(arr[i] < arr[(i + 1) % n])
                descCnt++;
        }

        return(ascCnt == 1 || descCnt == 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        if(checkSortedAndRotated(arr))
            System.out.println("The given array is sorted and rotated");
        else
        System.out.println("The given array is not sorted and rotated");    
    }
}
