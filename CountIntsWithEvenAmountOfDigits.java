// PROBLEM: Given an array of integers, tally up the integers with an even amount of digits
// Code Author: Ethan Willinger
// Committed: August 10th, 2022



class Solution {
    public int findNumbers(int[] nums) {
        
        //Numbers that contain an even number of digits.
        int evenAmountOfDigits = 0;
        
        for (int num : nums) {
            int length = (int) (Math.log10(num) + 1);
            
            if (length % 2 == 0) {
                evenAmountOfDigits++;
            }
        }
        
        return evenAmountOfDigits;
    }
}