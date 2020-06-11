package btmain; 

public class BToperation { 
   Node root; 
   
   ublic Node getRoot() { 
      return root; 
   } 
   
   
   public void createNode(int v) { 
      Node n = new Node(v); 
      if(root == null) { 
         root = n; 
      } 
      else { 
         Node temp = root, prevItem;
         while(true) {
               prevItem = temp; 
               if(temp.data > v) {
                  temp = temp.left;
                  if(temp == null) {
                     prevItem.left = n;
                     break;
                  }
               } 
               else {
                  temp = temp.right; 
                  if(temp == null) {
                     prevItem.right = n;
                     break;
                  }
               }
         } 
      } 
   } 
   
   
   public void inOrder(Node node) { 
      if(getRoot() == null) { 
         System.out.println("Empty Tree"); 
         return; 
      } 
      
      if(node == null) { 
         return;
      } 
      inOrder(node.left); 
      System.out.print(node.data + ", ");
      inOrder(node.right); 
   } 
   
   
   public boolean search(int v) { 
      if(root == null) { 
         System.out.println("List empty !!!"); 
         return false; 
      } 
      
      Node start = root; 
      while(true) { 
         if(start.data == v) 
            return true; 
         else if(v < start.data) { 
            if(start.left == null) 
               return false; 
               start = start.left; 
         } 
         else if(v > start.data) { 
            if(start.right == null) 
               return false; 
            start = start.right; 
         } 
      } 
   } 
} 

// Runner.prototype.gameOver = function() {console.log("TechSpartan")}






