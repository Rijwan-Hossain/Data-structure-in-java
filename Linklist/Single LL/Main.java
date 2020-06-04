package linklist1;

public class LinkList1 {
   public static void main(String[] args) {
      LLoperation operation = new LLoperation();
      operation.insertAtStart(20);
      operation.insertAtStart(10);
      operation.insertAtLast(40);
      operation.insertAtPos(12, 1);
      operation.insertAtPos(34, 5);

      operation.deleteAtPos(3);
      operation.deleteAtPos(4);
      operation.deleteAtPos(2);

      operation.showList(); 
      System.out.println(operation.search(55) == false ? "Not found" : "Found"); 
      System.out.println("List Empty: " + operation.isEmpty()); 
      System.out.println("Size: " + operation.getSize()); 
   } 
} 
