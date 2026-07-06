package sliding_window;
import java.util.*;

public class count_substring_containing_all_vowels {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left = 0;
        int count = 0;
        int freq [] = new int [26];
        for(int r = 0 ; r < s.length(); r++){
            char c= s.charAt(r);

            freq[c - 'a']++;
            while(freq['a'-'a']>0&& freq['e'-'a']>0 && freq['i'-'a']>0 && freq['o'-'a'] >0 && freq['u'-'a']>0){
                count+= s.length() - r;   //all valid substrings
                freq[s.charAt(left) - 'a']--;
                left++;
            }

        }
        System.out.print(count);

    }
    }


