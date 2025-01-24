import java.util.Scanner;
import java.util.Stack;

public class StackImple {

    private Stack<Integer> stack = new Stack<>();
    private Scanner scanner = new Scanner(System.in);

    private void run() {
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    checkIfEmpty();
                    break;
                case 5:
                    displayStack();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void push() {
        System.out.print("Enter an element to push: ");
        int element = scanner.nextInt();
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    private void pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    private void peek() {
        if (!stack.isEmpty()) {
            System.out.println("Top element: " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    private void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    private void displayStack() {
        System.out.println("Stack elements: " + stack);
    }

    public static void main(String[] args) {
        StackImple stackImple = new StackImple();
        stackImple.run();
    }
}
