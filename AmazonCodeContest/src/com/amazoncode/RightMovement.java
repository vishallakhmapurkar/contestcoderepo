package com.amazoncode;

public class RightMovement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input1 = { 4, 6 };
		int[] input2 = { 1, 3, 0, 0, 0, 0, 0, 0, 4, 5, 1, 0, 0, 0, 0, 6, 7, 6,
				0, 0, 0, 0, 5, 0 };
		System.out.println(numberOfPath(input1, input2));
		;

	}

	public static int numberOfPath(int[] input1, int[] input2) {
		int row = input1[0];
		int col = input1[1];
		int[][] partAry = new int[row][col];
		int ele = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				partAry[i][j] = input2[ele];
				ele++;
			}
		}
		int firstele = partAry[0][0];
		int lastele = partAry[row - 1][col - 1];
		int way = 0;
		int move = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				move = partAry[i][j];
				if (move == 1) {

					j = j + 1;
					continue;
				}
				if (move == 2) {

					i = i + 1;
					continue;
				}
				if (move == 3) {
					i = i + 1;
					j = j + 1;
					break;
				}
				if (move == 4) {
					if (partAry[i][j + 1] != 0) {

						j = j + 1;
						continue;
					} else if (partAry[i][j + 1] != 0) {
						i = i + 1;
						continue;
					}

				}
				if (move == 5) {
					if (partAry[i][j + 1] != 0) {

						j = j + 1;
						continue;
					} else if (partAry[i][j + 1] != 0) {
						i = i + 1;
						continue;
					}

				}

			}
		}
		return 0;
	}
}
