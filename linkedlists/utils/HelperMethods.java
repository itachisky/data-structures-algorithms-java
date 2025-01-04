package linkedlists.utils;

import java.util.Scanner;

public class HelperMethods {

    public static Node createLinkedList() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the linked list separated by spaces (e.g., '1 2 3'). Press Enter when done:");
        String input = scanner.nextLine();

        String[] values = input.split("\\s+");

        if (values.length == 0 || (values.length == 1 && values[0].isEmpty())) return null;

        Node head = new Node(Integer.parseInt(values[0]));
        Node current = head;
        for(int i = 1; i < values.length; i++) {
            current.next = new Node(Integer.parseInt(values[i]));
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
