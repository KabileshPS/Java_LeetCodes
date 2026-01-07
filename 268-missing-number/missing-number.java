class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int a=0;
        for(int i=0;i<n;i++)
        {
            a+=nums[i];
            sum+=i+1;
        }
        return sum-a;
    }
}