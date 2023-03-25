class Solution {
    public static int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i = 0; i < answer.length; i++){
            answer[i] = nums[i];
            for(int j = 0; j<i; j++){
                answer[i] += nums[j];
            }
        }
        return answer;
    }
}
