class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int median =nums[n-1];
        int move =0;
        for(int ele : nums){
            move+=Math.abs(median-ele);
        }
        return move;
    }
}