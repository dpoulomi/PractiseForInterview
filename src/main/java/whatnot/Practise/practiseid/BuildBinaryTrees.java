package whatnot.Practise.practiseid;

/*Please build a binary tree with a pre-order traversal sequence and an in-order traversal
 sequence. All elements in these two given sequences are unique.
 For example, if the input pre-order traversal sequence is {1, 2, 4, 7, 3, 5, 6, 8} and in-order traversal order is {4, 7,
 2, 1, 5, 3, 8, 6}, the built tree is shown in Figure 6-13.*/
public class BuildBinaryTrees {

	public class Node {
		int data;
		Node left;
		Node right;

		public Node(final int value, final Node left, final Node right) {
			data = value;
			this.left = left;

			this.right = right;
		}
	}

	public static void main(final String args[]) {
		final BuildBinaryTrees rll = new BuildBinaryTrees();
		final int preorderSequence[] = { 1, 2, 4, 7, 3, 5, 6, 8 };
		final int inorderSequence[] = { 4, 7, 2, 1, 5, 3, 8, 6 };
		final int start = 0;
		final int end = inorderSequence.length - 1;

		final Node n1 = rll.createTree(preorderSequence, inorderSequence, start, end);
		rll.printList(n1);
	}

	private int rootIndex = 0;

	private Node createTree(final int[] preorderSequence, final int[] inorderSequence,
			final int start, final int end) {
		if (start > end) {
			return null;
		}
		Node root = null; 
		if (rootIndex <= preorderSequence.length - 1) {
			root = new Node(preorderSequence[this.rootIndex], null, null);
			++this.rootIndex;
			if (start == end) {
				return root;
			}
			final int index = searchInorderIndex(preorderSequence, inorderSequence,
					start, end, root.data);

			root.left = createTree(preorderSequence, inorderSequence, start,
					index - 1);
			root.right = createTree(preorderSequence, inorderSequence,
					index + 1, end);
		}
		return root;
	}

	private int searchInorderIndex(final int[] preorderSequence,
			final int[] inorderSequence, final int start, final int end, final int data) {
		int i = 0;
		for (i = start; i <= end; i++) {
			if (inorderSequence[i] == data) {
				return i;
			}
		}

		return -1;
	}

	private void printList(final Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

}
