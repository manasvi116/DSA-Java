package sliding_window;
import java.util.*;
public class fruits_into_baskets {
    public static void main(String [] args){
        //optimized approach
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();

        int arr [] = new int [n];
        for(int  i =0 ;i < n ;i++){
            arr[i] = sc.nextInt();
        }
      int ans = atmost(arr , k ) - atmost(arr , k-1 );
        System.out.print(ans);

    }
    public static int atmost (int arr [] , int k){
        HashMap <Integer, Integer> map = new HashMap <> ();

        int left = 0;
        int totalsubarrays = 0;
        if(k<0){
            return 0;
        }

        for(int right = 0 ; right < arr.length ; right++){
            map.put(arr[right] , map.getOrDefault(arr[right] , 0)+1);
            while(map.size()>k){
                map.put(arr[left] , map.get(arr[left]) -1);
                if(map.get(arr[left]) ==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            totalsubarrays += right - left +1;
        }
        return totalsubarrays;
    }
}
