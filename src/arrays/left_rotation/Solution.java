// https://www.hackerrank.com/challenges/array-left-rotation/problem

package arrays.left_rotation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	
	private static void printArray(int[] arr) {
		for (int aInt: arr) {
			System.out.print(aInt + " ");
		}
	}
	
	private static int[] rotLeft(int[] a, int d) {
		int n = a.length;
		
		if (d % n == 0) {
			return a;
		} else {
			int[] arr = new int[n];
			if (d > n) {
				d %= n;
			}
			
			for (int i = 0; i < n; i++) {
				if ((d + i) < n) {
					arr[i] = a[d + i];
				} else {
					arr[i] = a[d + i - n];
				}
			}
			
			return arr;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		printArray(rotLeft(arr, d));
	}
}

