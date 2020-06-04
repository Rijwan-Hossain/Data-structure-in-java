package linklist1;

public class LLoperation {
   private int size;
   private Node start;
   private Node end;

   // check if empty
   public boolean isEmpty() {
      if (start == null)
         return true;
      else
         return false;
   }

   // get list size
   public int getSize() {
      return size;
   }

   // print list
   public void showList() {
      Node temp;
      if (isEmpty())
         System.out.println("The list is empty !");
      else {
         temp = start;
         for (int i = 1; i <= size; i++) {
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
         }
         System.out.println("");
      }
   }

   // insert at first
   public void insertAtStart(int v) {
      Node n = new Node();
      n.setData(v);
      if (isEmpty() == true) {
         n.setNext(null);
         end = n;
      } else {
         n.setNext(start);
      }
      start = n;
      size++;
   }

   // insert at last
   public void insertAtLast(int v) {
      Node temp;
      Node n = new Node();
      n.setData(v);
      n.setNext(null);
      if (isEmpty() == true) {
         start = n;
      } else {
         temp = end; // last node of previous list
         temp.setNext(n);
      }
      end = n;
      size++;
   }

   // insert at
   public void insertAtPos(int v, int p) {
      if (p == 1) {
         insertAtStart(v);
      } 
      else if (p == size + 1) {
         insertAtLast(v);
      } 
      else if (p > 1 && p <= size) {
         Node temp = start, prevItem = start;
         Node n = new Node();
         n.setData(v);

         for (int i = 1; i < p; i++) {
            prevItem = temp;
            temp = temp.getNext();
         }

         n.setNext(prevItem.getNext());
         prevItem.setNext(n);
         size++;
      } 
      else {
         System.out.println("Insertion not possible at: " + p);
      }
   }

   // search value in list
   public boolean search(int v) {
      Node temp = start;
      for (int i = 1; i <= size; i++) {
         if (temp.getData() == v) {
            return true;
         }
         temp = temp.getNext();
      }
      return false;
   }

   // delete at first 
   public void deleteFirst() {
      if (start != null) {
         start = start.getNext();
         size--;
      }
   } 

    // delete at last 
   public void deleteLast() { 
      Node temp = start, prevItem = start; 
      for(int i = 1; i < size; i++) { 
         prevItem = temp; 
         temp = temp.getNext(); 
      } 
      prevItem.setNext(null);
      end = prevItem;
      size--;
   } 

   // delete at 
   public void deleteAtPos(int p) { 
      if(p == 1) deleteFirst(); 
      else if(p == size) deleteLast(); 
      else if(p > 1 && p < size) { 
         Node temp = start, prevItem = start; 
         for(int i = 1; i < p; i++) { 
            prevItem = temp; 
            temp = temp.getNext(); 
         } 
         prevItem.setNext(temp.getNext()); 
         size--; 
      } 
      else { 
         System.out.println("No data at that position: " + p);
      } 
   } 
} 
