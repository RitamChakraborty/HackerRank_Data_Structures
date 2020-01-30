// https://www.hackerrank.com/challenges/sparse-arrays/problem

package arrays.sparse_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	private static int[] matchingStrings(String[] strings, String[] queries) {
		int n = strings.length;
		int d = queries.length;
		int[] arr = new int[d];
		
		for (int i = 0; i < d; i++) {
			int count = 0;
			
			for (String aString: strings) {
				if (aString.equals(queries[i])) {
					count++;
				}
			}
			
			arr[i] = count;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		String[] strings = new String[n];
		
		for (int i = 0; i < n; ++i) {
			strings[i] = scanner.next();
		}
		
		int q = scanner.nextInt();
		String[] queries = new String[q];
		
		for (int i = 0; i < q; ++i) {
			queries[i] = scanner.next();
		}
		
		for (int i : matchingStrings(strings, queries)) {
			System.out.println(i);
		}
	}
}
