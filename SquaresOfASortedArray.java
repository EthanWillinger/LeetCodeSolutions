// PROBLEM: Given a sorted array of unsigned integers, return a new sorted array of the integers squared
// Code Author: Ethan Willinger
// Committed: August 10th, 2022


/*Solution utilizes the two pointer algorithm, essentially this combines squaring and sorting in one pass, creating an O(n) solution instead of an O(log(n)) 
solution that would result from squaring all values then sorting the new array with a sort function */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int n = nums.length;
        int squaredArray[];
        squaredArray = new int[nums.length];
        int num;
        
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                num = nums[right];
                right--;
            } else {
                num = nums[left];
                left++;
            }
            
            squaredArray[i] = num * num;
        }
        
        return squaredArray;
    }
}