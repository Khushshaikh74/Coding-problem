import java.util.HashSet;
import java.util.Set;

public class RemoveDublicateElements{

    static int[] removeDublicates(int[] arr){
        Set<Integer> uniqueEle = new HashSet<>();

        for (int num : arr) {
            uniqueEle.add(num);
        }

        int[] ans = new int[uniqueEle.size()];
        int idx = 0;
        for (int i : uniqueEle) {
            ans[idx++] = i;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4};
        int result[] = removeDublicates(arr);

        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}