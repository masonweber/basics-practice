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
public interface Graph {
   public boolean adjacent(Object o, Object p); // whether two nodes are adjacent
   public Object[] neighbors(Object o); // return list of neighbors of node
   public void add(Object o); //add 
   public void delete(Object o);
   public Object get_node_value(Object o);
   public void set_node_value(Object o, Object p);
}
