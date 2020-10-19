static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode current = head;
    int count = 1;
    if (head == null){
        head = new SinglyLinkedListNode(data);
        return head;
    }
    if (position == 0) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    while(current.next != null) {
        if (count == position) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = current.next;
            current.next = newNode;
        }
        current = current.next;
        count += 1;
    }
    return head;
}
