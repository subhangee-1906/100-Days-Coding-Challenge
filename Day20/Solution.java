import java.util.Scanner;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

public class Solution {

    public static int compareLists(SinglyLinkedListNode llist1, SinglyLinkedListNode llist2) {
        
        while (llist1 != null && llist2 != null) {
            if (llist1.data != llist2.data) {
                return 0;  
            }
            llist1 = llist1.next;
            llist2 = llist2.next;
        }

        
        if (llist1 == null && llist2 == null) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();
            int list1Count = scanner.nextInt();
            for (int i = 0; i < list1Count; i++) {
                llist1.insertNode(scanner.nextInt());
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();
            int list2Count = scanner.nextInt();
            for (int i = 0; i < list2Count; i++) {
                llist2.insertNode(scanner.nextInt());
            }

            int result = compareLists(llist1.head, llist2.head);
            System.out.println(result);
        }

        scanner.close();
    }
}
