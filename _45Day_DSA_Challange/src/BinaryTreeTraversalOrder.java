package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeTraversalOrder {
    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> list  = new ArrayList<>();
        if (root == null) {
            return list ;
        }
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.offer(root) ;

        while (!queue.isEmpty()){
            int levelSize =  queue.size() ;
            List<Integer> currentLevel = new ArrayList<>(levelSize) ;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val) ;

                if (currentNode.left != null) {
                  queue.offer(currentNode.left) ;
                }
                
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            list.add(0, currentLevel) ;

      }
        return list ; 
    }
}