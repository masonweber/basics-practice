/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewpractice;

/**
 *
 * @author Mason
 */
public class MyGraph implements Graph {
    //class variables

    //constructor
    public MyGraph() {

    }

    //implement graph methods
    @Override
    public boolean adjacent(Object o, Object p) {
        return false;
    }

    @Override
    public Object[] neighbors(Object o) {
        Object[] p = new Object[1];
        return p;
    }

    @Override
    public void add(Object o) {
        
    }

    @Override
    public void delete(Object o) {
        
    }

    @Override
    public Object get_node_value(Object o) {
        return o;
    }

    @Override
    public void set_node_value(Object o, Object p) {

    }
}
