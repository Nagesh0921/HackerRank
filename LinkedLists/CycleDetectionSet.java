static boolean hasCycle(SinglyLinkedListNode head) {
    HashSet<SinglyLinkedListNode> hashValues = new HashSet<>();
    if (head == null) {
        return false;
    }
    SinglyLinkedListNode current = head;
    while (current != null){
        if (hashValues.contains(current)){
            return true;
        } else {
            hashValues.add(current);
        }
        current = current.next;
    }
    return false;
}
