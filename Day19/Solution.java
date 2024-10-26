import java.io.*;
import java.util.*;

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

    public SinglyLinkedList() {
        this.head = null;
    }
    public void insertNodeAtHead(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;
    }
    public void printList() {
        SinglyLinkedListNode current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertNodeAtHead(data);
        }
        list.printList();

        scanner.close();
    }
}
