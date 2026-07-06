//3. Longest Substring Without Repeating Characters
// Approach: Sliding Window
// Time: O(n)
// Space: O(1)

package sliding_window;
import java.util.*;

public class longest_subarray_without_repeating_characters {
    public static void main(String [] args){
        //opitimized appraoch //sliding window // hashset
        Scanner sc = new Scanner(System.in);
        int left =0;
        int max =0;
        String s = sc.next();
        HashSet <Character> set = new HashSet <> ();
        for(int r = 0 ; r < s.length() ; r++){
            while(set.contains(s.charAt(r))){ //check whether current char in set or not
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            max = Math.max(max , r -left + 1); //update max
        }
      System.out.print(max);
    }
}
