package Practise.practiseid;

public class EightQueensPuzzles {

	public static void main(String args[]) {
		EightQueensPuzzles eqp = new EightQueensPuzzles();
		eqp.EightQueen();

	}

	public int EightQueen() {
		int columnIndex[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int count = 0;
		Permutation(columnIndex, 8, 0, count);
		return count;
	}

	public void Permutation(int columnIndex[], int length, int index, int count) {
		int i, temp;
		if (index == length) {
			if (Check(columnIndex, length) != 0) {
				count++;
			}
		} else {
			for (i = index; i < length; ++i) {
				temp = columnIndex[i];
				columnIndex[i] = columnIndex[index];
				columnIndex[index] = temp;
				Permutation(columnIndex, length, index + 1, count);
				temp = columnIndex[index];
				columnIndex[index] = columnIndex[i];
				columnIndex[i] = temp;
			}
		}
	}

	/*
	 * If there are two queens on the same diagonal, it returns 0, otherwise it
	 * returns 1.
	 */
	int Check(int columnIndex[], int length) {
		int i, j;
		for (i = 0; i < length; ++i) {
			for (j = i + 1; j < length; ++j) {
				if ((i - j == columnIndex[i] - columnIndex[j])
						|| (j - i == columnIndex[i] - columnIndex[j]))
					return 0;
			}
		}
		return 1;
	}
}
