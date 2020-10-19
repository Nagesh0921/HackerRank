static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedListNode current1 = head1;
    SinglyLinkedListNode current2 = head2;
    while (current1 != null) {
        if ((current1.next == null && current2.next != null) || (current2.next == null && current1.next != null)){
            return false;
        }
        if (current1.data == current2.data){
            current1 = current1.next;
            current2 = current2.next;
        } else {
            return false;
        }
    }
    return true;
}
