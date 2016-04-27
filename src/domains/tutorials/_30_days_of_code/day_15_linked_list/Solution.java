package domains.tutorials._30_days_of_code.day_15_linked_list;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class Solution {
	public static Node insert(Node head, int data) {
		Node n = new Node(data);

		if (head == null) {
			head = n;
			return head;
		}

		Node aux = head;
		while (aux.next != null) {
			aux = aux.next;
		}

		aux.next = n;

		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		sc.close();
		display(head);
	}
}
