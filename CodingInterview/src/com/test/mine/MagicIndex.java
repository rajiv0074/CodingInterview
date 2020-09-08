package com.test.mine;

public class MagicIndex {
	public int search(int[] A, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (mid == A[mid]) // check for magic index.
				return mid;
			if (mid > A[mid]) { // If mid>A[mid] means fixed point might be on
								// the right half of the array
				return search(A, mid + 1, end);
			} else {// If mid<A[mid] means fixed point might be on
				// the left half of the array
				return search(A, start, mid - 1);
			}
		}
		return -1;
	}
	
	 public static int magicFastWithDuplicate(int[] array, int start, int end) {

		    if (end < start || start < 0 || end >= array.length) {
		     return -1;
		     }

		     int midlndex = (start + end) / 2;
		     int midValue = array[midlndex];
		     if (midValue == midlndex) {
		       return midlndex;
		     }

		     /* Search left */
		     int leftlndex = Math.min(midlndex - 1, midValue);
		     int left = magicFastWithDuplicate(array, start, leftlndex);
		     if (left >= 0) {
		     return left;
		     }

		     /* Search right */
		     int rightlndex = Math.max(midlndex + 1, midValue);
		     int right = magicFastWithDuplicate(array, rightlndex, end);
		     return right;    
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr = { -1, 0, 1, 2, 4, 10 }; // Distinct Numbers
		int[] A = {1,2,3,3,4,5,6,7,8,9,10};  // Duplicate Numbers
		MagicIndex m = new MagicIndex();
		System.out.println("Magic index " + m.search(Arr, 0, Arr.length - 1));
		System.out.println("Magic index Duplicates" + m.magicFastWithDuplicate(A, 0, A.length - 1));
		
	}
}
