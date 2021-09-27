package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_PreOrder {

    List<Integer> answer = new ArrayList<>();
    void pre(TreeNode root , List<Integer> output){
        if(root == null) return;
        output.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void preorderTraversal(TreeNode root) {
        pre(root,answer);
    }
}
