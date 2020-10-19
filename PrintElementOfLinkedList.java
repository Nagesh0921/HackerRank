static void printLinkedList(SinglyLinkedListNode head) {
    SinglyLinkedListNode current = head;
    if (head == null) { return;}
    while (current != null){
        System.out.println(current.data);
        current = current.next;
    }
}
