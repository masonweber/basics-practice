/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewpractice;

/**
 * Binary Search Tree
 * @author Mason Weber
 */
public interface BSTree {
    public boolean contains(Object o); // search tree for an object
    public void insert(Object o); // insert object or do nothing if it exists
    public void delete(Object o); // delete object if it exists or do nothing
}
