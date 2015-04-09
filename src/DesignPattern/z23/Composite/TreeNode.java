package DesignPattern.z23.Composite;

import sun.reflect.generics.tree.Tree;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by suse on 15-4-9.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();


    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }


    public void add(TreeNode n){
        children.add(n);
    }

    public void remove(TreeNode n){
        children.remove(n);
    }


    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }


}
