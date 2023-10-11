package Easy;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int temp = 1;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                nums[temp] = nums[i+1];
                temp++;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2};
        int k = removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
