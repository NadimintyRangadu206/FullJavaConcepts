package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;

/**
 * 
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a new array and return it.

 

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 

Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 105
intervals is sorted by starti in ascending order.
newInterval.length == 2
0 <= start <= end <= 105
 * @author nadim
 *
 */

public class InsertIntervals {

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		int arr[][] = new int[intervals.length + 1][2];

		int a[][] = new int[1][2];

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = newInterval[k];
				k++;
			}
		}

		arr[0] = a[0];

		int t = 0;
		for (int i = 1; i < arr.length; i++) {

			arr[i] = intervals[t];
			t++;

		}

		int result[][] = new int[arr.length][2];

		Arrays.sort(arr, (c, d) -> c[0] - d[0]);

		int j = 0;
		result[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (result[j][1] >= arr[i][0]) {

				result[j][1] = Math.max(result[j][1], arr[i][1]);
			} else {
				result[++j] = arr[i];
			}

		}

		return Arrays.copyOfRange(result, 0, j + 1);

	}

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 6, 9 } };

		int[] newIntervals = { 2, 5 };

		System.out.println(insert(intervals, newIntervals));

	}

}
