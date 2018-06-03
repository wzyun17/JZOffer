/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author User
 * 思路：二分查找变形题目。。。
 */
public class Main06 {

	public static void main(String[] args) {
		int [] array = {3,4,5,1,2};
		System.out.println(new Solution06().minNumberInRotateArray1(array));
	}

}

class Solution06 {
	int first = 0;
	int last = 0;
	int mid = 0;
    public int minNumberInRotateArray(int [] array) {
    	if(array.length == 0) return 0;
    	if(last == 0) last = array.length -1;
    	mid = (first + last)/2;
    	if(array[mid]>=array[mid+1]&&last-first==1) return array[mid+1];
    	if(array[mid] >= array[first]) {
    		first = mid;
    		return minNumberInRotateArray(array);
    	}else {
    		last = mid;
    		return minNumberInRotateArray(array);
    	}    	
    }
	public int minNumberInRotateArray1(int [] array) {
		int low = 0 ; int high = array.length - 1; 
		while(low < high){
			int mid = low + (high - low) / 2;
			if(array[mid] > array[high]){
				low = mid + 1;
			}else if(array[mid] == array[high]){
				high = high - 1;
			}else{
				high = mid;
			}
		}
		return array[low];
	}



}

