
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 4;
		
		System.out.print(search(nums, target));

	}
	
	public static int search(int[] nums, int target) {
        int index = searchRotatedSortedArray(nums, target, 0, nums.length-1);
        return index;
        
    }
    
    public static int searchRotatedSortedArray(int[] nums, int key, int low, int high){
        if(low>high){
            return -1;
        }
        
        int mid = (low+high)/2;
        if(nums[mid]==key){
            return mid;
        }
        else if(nums[low]<nums[mid]){//array from low to mid is sorted.
            if(key>=nums[low] && key<=nums[mid]){
                return searchRotatedSortedArray(nums,key,low,mid-1);
            }
            else{
                return searchRotatedSortedArray(nums,key, mid+1, high);
            }
        }
        else{
            if(key>=nums[mid] && key<=nums[high]){
                return searchRotatedSortedArray(nums,key,mid+1,high);
            }
            else{
                return searchRotatedSortedArray(nums,key, low, mid-1);
            }
        }
    }
    
    //Time Complexity  : O(logn).
    //same as the binary search.

}
