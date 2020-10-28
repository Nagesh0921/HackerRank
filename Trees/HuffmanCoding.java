void decode(String s, Node root) {
   Node walker = root; 
   if (s == null || root == null){
       return;
   }
   for(int i=0; i<s.length(); i++) {
       walker = (s.charAt(i) == '1') ? walker.right : walker.left;
       if (walker.left == null && walker.right == null){
           System.out.print(walker.data);
           walker = root;
       }
   }
}
