package linklist1;

public class Node {
   private int data;
   private Node next;

   public Node() {
      this.data = 0;
      this.next = null;
   }

   public Node(int v, Node n) {
      this.data = v;
      this.next = n;
   }

   public int getData() {
      return data;
   }

   public void setData(int data) {
      this.data = data;
   }

   public Node getNext() {
      return next;
   }

   public void setNext(Node next) {
      this.next = next;
   }
}
