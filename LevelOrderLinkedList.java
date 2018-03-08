//Create a linkedlist for each levels if the BST.
import java.util.*;
class Node {
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
    public String toString(){
        return " " + this.data +" ";
    }
}
public class LevelOrderLinkedList {
    public static void main(String args[]) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(11);
        LevelOrderLinkedList ob = new LevelOrderLinkedList();
        int levels = LevelOrderLinkedList.noOfLevels(root);
        LinkedList<Node> ll[] = new LinkedList[levels];
        ob.LinkedListEachLevel(root,0,ll);
        for(int i=0;i<levels;i++){
            System.out.println(ll[i]);
        }
    }
    public static int noOfLevels(Node temp){
        if(temp==null){
            return 0;
        }
        return (1+Math.max(noOfLevels(temp.left),noOfLevels(temp.right)));
    }
    public void LinkedListEachLevel(Node temp,int level,LinkedList<Node> ll[]){
        //int levels = LevelOrderLinkedList.noOfLevels(temp);
        /*
        LinkedList<Node> ll[] = new LinkedList<Node>[levels]();
        for(int i=0;i<levels-1;i++){
            ll[i] = new LinkedList<Node>();
            ll[i].insert(temp);
            ll[i+1] = new LinkedList<Node>();
            ll[i].insert(temp.left);
            ll[i].insert(temp.right);
            */
            if(ll[level]==null){
                ll[level] = new LinkedList<Node>();
            }
            if(temp!=null)
                ll[level].add(temp);
            if(temp.left!=null){
                LinkedListEachLevel(temp.left,level+1,ll);
            }
             if(temp.right!=null){
                LinkedListEachLevel(temp.right,level+1,ll);
            }


        }
}
    

