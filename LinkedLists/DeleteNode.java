static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    if(position == 0){
            head = head.next;
            return head;
        }
        int count = 0;
        SinglyLinkedListNode current = head, prev = current;
        while(current != null){
            if(count == position){
                current = current.next;
                prev.next = current;
            }
            prev = current;
            current = current.next;
            count ++;
        }

        return head;
}
