package linkedlists;

import linkedlists.utils.HelperMethods;
import linkedlists.utils.Node;

public class SingleLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtPosition(int value, int position) {
        int length = this.length(head);

        if ((length == 0 && position != 0) || position > length) {
            System.out.println("Invalid Operation");
        } else {
            Node current = head;
            Node newNode = new Node(value);
            int temp = 1;
            while (temp < position - 1) { 
                current = current.next;
                temp += 1;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int length(Node head) {
        int listLength = 0;
        if (head == null) {
            return 0;
        } else {
            while (head != null) { 
                listLength += 1;
                head = head.next;
            }
        }
        return listLength;
    }

    public void reverse() {
        Node temp = head;
        Node prev = null;
        Node front;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        head = prev;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.setHead(HelperMethods.createLinkedList());

        HelperMethods.printLinkedList(list.getHead());
        list.insertAtLast(4);
        HelperMethods.printLinkedList(list.getHead());

        HelperMethods.printLinkedList(list.getHead());
        list.insertAtFirst(0);
        HelperMethods.printLinkedList(list.getHead());

        HelperMethods.printLinkedList(list.getHead());
        list.insertAtPosition(2, 3);
        HelperMethods.printLinkedList(list.getHead());

        int length = list.length(list.getHead());
        System.out.println("Length of the List is: " + length);
    }
}
