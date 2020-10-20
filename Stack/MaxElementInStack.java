import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        Stack<Node> stackNode = new Stack<>();
        for (int i = 0; i<iteration; i++) {
            int query = sc.nextInt();
            if (query == 1) {
                int element = sc.nextInt();
                if (stackNode.isEmpty()) {
                    stackNode.push(new Node(element, element));
                } else {
                    if (element < stackNode.peek().maxValue) {
                        stackNode.push(new Node(element, stackNode.peek().maxValue));
                    } else {
                        stackNode.push(new Node(element, element));
                    }
                } 
            }
            if (query == 2) {
                if (!stackNode.isEmpty()) {
                    stackNode.pop();
                }
            }
            if (query == 3) {
                System.out.println(stackNode.peek().maxValue);
            }
        }
    }
}

class Node {
    int curValue;
    int maxValue;

    public Node(int value, int maxValue){
        this.curValue = value;
        this.maxValue = maxValue;
    }
}
