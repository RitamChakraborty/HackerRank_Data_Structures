// https://www.hackerrank.com/challenges/arrays-ds/problem

package arrays.arrays_ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = n - 1; i >= 0; --i) {
			System.out.print(arr[i] + " ");
		}
	}
}
