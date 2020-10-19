public void reverseWithStack() {
  Stack<Integer> stk = new Stack<>();
  LinkedListNode current = head;
  while (current != null) {
    stk.push(current.data);
    current = current.next;
  }
  while (!stk.isEmpty()) {
    System.out.println(stk.pop());
  }
}
