// PROBLEM: Given a binary array, find the largest number of consecutive ones.
// Code Author: Ethan Willinger
// Date Committed: August 10th 2022


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        //Initial variables
        int maxOnes = 0;
        int tempMaxOnes = 0;
        
        //Core loop, go through array nums, add to tempMaxOnes if num is 1 and set to 0 if num is 0;
        for (int num : nums) {
            if (num == 0) {
                tempMaxOnes = 0;
            } else {
                tempMaxOnes++;
                
                //Set maxOnes to tempMaxOnes if temporary variable exceeds maxOnes
                if (tempMaxOnes > maxOnes) {
                    maxOnes = tempMaxOnes;
                }
            }
        }
        
        return maxOnes;
    }
}