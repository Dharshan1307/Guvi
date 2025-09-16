package Day8;

public class FindMinimum {

    // Node class for each element
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Linked list with method to find minimum
    static class LinkedListMin {
        Node head;

        // Add a node at the end
        public void addNode(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        // Find smallest element in the list
        public int findMin() {
            if (head == null) {
                throw new RuntimeException("List is empty");
            }

            int min = head.data;
            Node curr = head.next;

            while (curr != null) {
                if (curr.data < min) {
                    min = curr.data;
                }
                curr = curr.next;
            }
            return min;
        }
    }

    // Main method to create list and print minimum
    public static void main(String[] args) {
        LinkedListMin list = new LinkedListMin();

        // Create 10 -> 50 -> 2 -> 3 -> 50 -> null
        list.addNode(10);
        list.addNode(50);
        list.addNode(2);
        list.addNode(3);
        list.addNode(50);

        System.out.println("Minimum element: " + list.findMin());
    }
}
