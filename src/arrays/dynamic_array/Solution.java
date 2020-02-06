// https://www.hackerrank.com/challenges/dynamic-array/problem

package arrays.dynamic_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int lastAnswer = 0;
		List<List<Integer>> seqList = new ArrayList<>();
		
		for (int i = 0; i < n; ++i) {
			seqList.add(new ArrayList<>());
		}
		
		while (t-- > 0) {
			int type = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int seq = (x ^ lastAnswer) % n;
			
			if (type == 1) {
				seqList.get(seq).add(y);
			} else if (type == 2) {
				int size = seqList.get(seq).size();
				lastAnswer = seqList.get(seq).get(y % size);
				System.out.println(lastAnswer);
			}
		}
	}
}
