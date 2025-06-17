public class Singlelinkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertbeg(10);
        list.insertbeg(20);
        list.insertbeg(30);
        list.insertbeg(40);
        list.insertend(60);
        list.insertpos(70, 3);
        list.deletebeg();
        list.deleteend();
        list.deletepos(2);
        list.print();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    Node gethead() {
        return head;
    }

    void insertbeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertpos(int data, int pos) {
        int length = length();
        if (pos < 0 || pos > length) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            insertbeg(data);
            return;
        }
        if (pos == length) {
            insertend(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void print() {
        Node temp = head;
        System.out.print("The elements are: ");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    int deletebeg() {
        if (head == null) {
            System.out.println("No elements");
            return -1;
        }
        int removedelement = head.data;
        head = head.next;
        return removedelement;
    }

    int deleteend() {
        int length1 = length();
        if (length1 == 0) {
            System.out.println("No elements");
            return -1;
        }
        if (length1 == 1) {
            int removedelement = head.data;
            head = null;
            return removedelement;
        }
        Node temp = head;
        for (int i = 1; i < length1 - 1; i++) {
            temp = temp.next;
        }
        int removedelement = temp.next.data;
        temp.next = null;
        return removedelement;
    }

    int deletepos(int pos) {
        int length1 = length();
        if (pos < 0 || pos >= length1) {
            System.out.println("Invalid position");
            return -1;
        }

        if (pos == 0) {
            return deletebeg();
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        int removedele = temp.next.data;
        temp.next = temp.next.next;
        return removedele;
    }
}
