class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]==nums[i+1]);
            int low=i+1;
            int high=n-1;
            while(low<high){
                int current=nums[i]+nums[low]+nums[high];
                if(current==0){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[low]);
                    l.add(nums[high]);
                    if(!ans.contains(l)) ans.add(l);
                    low++;
                    high--;
                }
                else if(current<0) low++;
                else high--;
            }
        }
        return ans;
    }
}
