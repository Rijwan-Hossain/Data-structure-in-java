public class BSTmain { 
   public static void main(String[] args) { 
      BToperation opr = new BToperation(); 
      Node rooter = opr.getRoot(); 
      opr.search(77); 
      
      opr.createNode(50); 
      opr.createNode(15); 
      opr.createNode(30); 
      opr.createNode(25); 
      opr.createNode(75); 
      opr.createNode(85); 
      
      Node root = opr.getRoot(); 
      opr.inOrder(root); 
      System.out.println(""); 
      
      boolean result = opr.search(77); 
      if(result) System.out.println("Found"); 
      else System.out.println("NOT Found"); 
   } 
} 