/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewpractice;

/**
 *
 * @author Mason Weber
 */
public class MyBSTree implements BSTree{
    //class variables
    Node head;

    //constructor
    public MyBSTree() {
        head = null;
    }
    
    public MyBSTree (Object o) {
        head = new Node(o);
    }
    
    //implelemt methods
    @Override
    public boolean contains(Object o) { // search tree for an object
        return false; //placeholder return value
    }
    
    @Override
    public void insert(Object o) { // insert object or do nothing if it exists
        
    }
    
    @Override
    public void delete(Object o) { // delete object if it exists or do nothing
        
    }
    
    private class Node implements Comparable{
        //class variables
        Node left, right;
        Object data;
        
        public Node(Object data) {
            this.data = data;
        }
        
        @Override
        public int compareTo(Object o) {
            //this.o > o, return 1
            //this.o == 0, return 0
            //this.o < 0, return -1
            return 0;
        }
        
        public Node getLeft() {
            return left;
        }
        
        public void setLeft(Node n) {
            left = n;
        }
        
        public Node getRight() {
            return right;
        }
        
        public void setRight(Node n) {
            right = n;
        }
        
        public Object getData() {
            return data;
        }
    }
}
