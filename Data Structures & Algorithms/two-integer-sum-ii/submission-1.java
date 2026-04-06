class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=1;
        while(i<numbers.length && j<numbers.length){
            if(numbers[i]+numbers[j]==target) return new int[]{i+1,j+1};
            if(j==numbers.length-1){
                i++;
                j=i;
            }
            j++;
        }
        return new int[]{};
    }
}
