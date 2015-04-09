package DesignPattern.z23.Composite;

/**
 * Created by suse on 15-4-9.
 */
public class Tree {

    TreeNode root = null;


    public Tree(String name) {
        root = new TreeNode(name);
    }


    public static void main(String[] args) {


        Tree tree = new Tree("A");

        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC );

        tree.root.add(nodeB);

        System.out.println("built tree");

    }

}
