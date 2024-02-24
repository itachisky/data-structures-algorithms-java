package LinkedList;

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtLast(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;

    }

    static String printList() {
        Node current = head;
        String str = "";

        while(current != null) {
            str = str + current.data;

            if (current.next != null) {
                str = str + " -> ";
            }

            current = current.next;
        }

        return str;
    }

    static int getLength() {
        Node current = head;
        int count = 0;

        while(current != null) {
            count += 1;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Linked List Operations:");

        LinkedList list = new LinkedList();

        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);

        list.insertAtLast(10);
        list.insertAtLast(9);

        System.out.println("Length: " + list.getLength());
        System.out.println("Length: " + list.printList());
    }
}
