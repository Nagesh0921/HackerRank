static int getNode(SinglyLinkedListNode head, int positionFromTail) {
    if (head == null){
        return 0;
    }
    int count = 0;
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
    current = head;
    while (current != null){
        if (count == positionFromTail) {
            System.out.println(current.data);
            return current.data;
        }
        count+=1;
        current = current.next;
    }
    return 1;
}
