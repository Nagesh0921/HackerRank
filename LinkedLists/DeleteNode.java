static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    SinglyLinkedListNode current = head;
    if (head == null){
        return head;
    }
    int count = 1;
    if (position == 0) {
        current = head.next;
        head = current;
        return head;
    }
    while (current.next != null){
        if (count == position) {
            current.next = current.next.next;
        }
        current = current.next;
        count += 1;
    }
    return head;
}
