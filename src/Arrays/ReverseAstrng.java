package Arrays;

/*
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */

public class ReverseAstrng {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        for(int i = left; i <= right; i++){
            if(left<right) {
                char temp = s[i];
                s[i] = s[right];
                s[right] = temp;
                right--;
                left++;
            }else {
                break;
            }
        }

        while(left < right) { // very important learning
            char temp = s[left];
            s[left]= s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
