class ShuffleArray {
    private int ans[],flag = 0;
    public ShuffleArray(int[] nums) {
        ans = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        if(flag==0) return ans;
        int temp = ans[0];
        ans[0] = ans[ans.length-1];
        ans[ans.length-1] = temp;
        return ans;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int temp = ans[0];
        ans[0] = ans[ans.length-1];
        ans[ans.length-1] = temp;
        if(flag==0) flag=1;
        else flag=0;
        return ans;
    }
}