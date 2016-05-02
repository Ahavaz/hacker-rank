package domains.tutorials._30_days_of_code.day_23_binary_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class Solution {
	static void levelOrder(Node root) {
		if (root != null) {
			LinkedList<Node> queue = new LinkedList<>();
			ArrayList<Node> list = new ArrayList<>();

			queue.add(root);

			while (!queue.isEmpty()) {
				Node aux = queue.remove();
				list.add(aux);

				if (aux.left != null) {
					queue.add(aux.left);
				}

				if (aux.right != null) {
					queue.add(aux.right);
				}
			}

			for (Node node : list) {
				System.out.print(node.data + " ");
			}
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		levelOrder(root);
	}
}
