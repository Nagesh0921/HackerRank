static void reversePrint(SinglyLinkedListNode head) {
    if (head == null){
        return;
    }
    SinglyLinkedListNode current = head;
    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
    current = head;
    while (current != null){
        System.out.println(current.data);
        current = current.next;
    }
}
