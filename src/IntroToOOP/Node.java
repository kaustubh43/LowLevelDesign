package IntroToOOP;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(Node other){
        this.data = other.data;
        this.next = other.next != null ? new Node(other.next) : null;
    }

    public static void main(String[] args) {
        Node N1 = new Node(5);
        N1.next = new Node(6);

        Node copyN1 = new Node(N1);
    }
}
