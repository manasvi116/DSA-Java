//1248. Count Number of Nice Subarrays
// Approach: Exactly(k) = Atmost(k) - Atmost(k-1)
// Time: O(n)
// Space: O(1)

package sliding_window;
import java.util.*;

public class count_nice_subarrays {
    public static void main(String[] args) {
        //optimized approach (Atmost trick)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = atmostk(arr ,k) - atmostk(arr , k-1);
        System.out.print(ans);
    }
    public static int atmostk(int arr [],int k ){
        int count = 0 ;                  ;
        int left = 0;
        int oddnocount =0;
        for(int r = 0 ; r< arr.length ; r++){
            if(arr[r] %2 !=0){
                oddnocount++;
            }
            while(oddnocount>k){
                if(arr[left]%2!=0){
                    oddnocount--;
                }
                left++;
            }
            count+= r-left +1;

}
        return count ;
    }
}