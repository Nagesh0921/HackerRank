public static int height(Node root) {
    // Write your code here.
    if (root == null){
        return -1;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    if (leftHeight > rightHeight) {
        return leftHeight+1;
    } else {
        return rightHeight+1;
    }
}
