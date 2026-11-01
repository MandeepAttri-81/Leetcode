class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int n =nums.length;
        int sum=0;
        for(int i =0;i<n;i++){
         min = Math.min(min, nums[i]);
         sum+=nums[i];
        }
        return sum-(min*n);
        
    }
}