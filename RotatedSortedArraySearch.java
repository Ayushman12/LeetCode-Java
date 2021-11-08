public class RotatedSortedArraySearch {
	private static int search(int ar[], int key) {
		if(ar==null || ar.length == 0) return -1;
		int left = 0;
		int right = ar.length-1;
		int ans = -1;
		//finding the lowest element in the rotated array
		while(left<right) {
			int mid = left + (right - left)/2;
			if(ar[mid] > ar[right])
				left = mid + 1;
			else
				right = mid;
		}
		
		//finding the correct half of the array to search the element
		int start = left;
		left = 0;
		right = ar.length-1;
		if(key>=ar[start] && key<=ar[right])
			left = start;
		else
			right = start;
		
		// simple binary search on the sub-array
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(ar[mid] == key)
				return mid;
			else if(key > ar[mid])
				left = mid + 1;
			else
				right = mid - 1;
		}
		return ans;
	}
	public static void main(String[] args) {
		int ar[] = {9,11,12,15,16,21,0,1,3,4,6,8};
		int key = 0;
		System.out.println("Present at index : "+ search(ar,key));
	}
}