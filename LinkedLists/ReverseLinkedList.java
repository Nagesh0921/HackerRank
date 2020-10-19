static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    if (head == null) {
        return head;
    }
    SinglyLinkedListNode current = head;
    SinglyLinkedListNode next = null;
    SinglyLinkedListNode prev = null;
    while (current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
    return head;
}
