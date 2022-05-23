package basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

class Basics{
	
	static void reverse(int[] a, int i, int j) {
		int l = i;
		int r = j;
		 
		while(l < r) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			
			l++;
			r--;
		}
	}
	
	static void rotate(int a[], int k) {
		k = k % a.length;
		if(k < 0) {
			k = k + a.length;
		}
		
		reverse(a, 0, a.length - k - 1);
		reverse(a, a.length - k, a.length - 1);
		reverse(a, 0, a.length - 1);
		display(a);
	}
	
	static void display(int[] a) {
		for(int aa: a) {
			System.out.print(aa + " ");
		}
		
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int carr[] = new int[arr.length];
		
		
		for(int a: arr) {
			System.out.println(a<<1);
		}
		
		for(int i = 0; i<arr.length; i++) {
			carr[i] = arr[i];
		}
		
		System.out.println("Copied array is");
		for(int a: carr) {
			System.out.print(a + " ");
		}
		
		int count_arr[] = {1,2,1,3,4,5};
		int count = 0;
		HashMap<Integer, Integer> h = new HashMap();
		
		for(int i = 0; i < count_arr.length; i++) {
				if(h.containsKey(count_arr[i])) {
					h.put(count_arr[i], h.get(count_arr[i]) + 1);
				}else {
					h.put(count_arr[i], 1);
				}
		}
		
		System.out.println("\nFreq of array elements are");
		for(Entry<Integer, Integer> hh: h.entrySet()) {
			System.out.println(hh.getKey() + "   " +hh.getValue());
		}
		
		int k = 2;
		rotate(arr, k);
		System.out.println("\nThe reversed elements are");
		display(arr);
		
	}
	

}

/**
output

2
4
6
8
10
Copied array is
1 2 3 4 5 
Freq of array elements are
1   2
2   1
3   1
4   1
5   1
4 5 1 2 3 
The reversed elements are
4 5 1 2 3 

**/