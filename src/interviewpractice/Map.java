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
public interface Map {
    public void clear();
    public void put(Object o, Object p);
    public Object get(Object o);
    public void remove(Object o);
    public boolean contains(Object o);
    public boolean isEmpty();
    public int size();
}
