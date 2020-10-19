static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode current = head;
    if (head == null){
        head = new SinglyLinkedListNode(data);
        return head;
    }
    while (current.next != null){
        current = current.next;
    }
    current.next = new SinglyLinkedListNode(data);
    return head;
}
