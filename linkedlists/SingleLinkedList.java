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

    public void add(int value) {
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

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.setHead(HelperMethods.createLinkedList());

        HelperMethods.printLinkedList(list.getHead());
    }
}
