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
public interface LinkedList {
    public void insertAfter(Object o, Object p);
    public void insertBeginning(Object o);
    public void insertEnd(Object o);
    public boolean contains(Object o);
    public void remove(Object o);
}
