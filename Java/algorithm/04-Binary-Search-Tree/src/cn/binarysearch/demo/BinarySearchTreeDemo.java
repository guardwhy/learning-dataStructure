package cn.binarysearch.demo;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        // 向二叉树中添加节点
        tree.add(6);
        tree.add(9);
        tree.add(1);
        tree.add(3);
        tree.add(11);
        tree.add(5);
        // 判断元素是否存在
        System.out.println(tree.contains(11));
        System.out.println(tree.contains(10));

        // 调用前序遍历
        System.out.println("===前序遍历【递归】===");
        tree.preOrder();
        System.out.println("===前序遍历【非递归】===");
        tree.preOrderNR();

        System.out.println("==========");
        System.out.println(tree);
        // 调用中序遍历
        /*
        System.out.println("===中序遍历【递归】===");
        tree.inOrder();
        System.out.println("===中序遍历【非递归】===");
        tree.inOrderNR();

        */
        // 调用后序遍历
        /*System.out.println("===后序遍历【递归】===");
        tree.postOrder();
        System.out.println("===后序遍历【非递归】===");
        tree.postOrderNR();*/

        // 层序遍历
       /* System.out.println("===层序遍历===");
        tree.levelOrder();*/

        // 返回最小值
        /*System.out.println("二叉搜索树最小节点:" + tree.minimum1());
        System.out.println("二叉搜索树最小节点:" + tree.minimum2());
        System.out.println("二叉搜索树最大节点:" + tree.maximum());*/

        // 删除二叉搜索树中的最小值
        /*System.out.println("二叉树最小节点[删除前]:" + tree.minimum());
        System.out.println(tree.removeMin());
        System.out.println("二叉树最小节点[删除后]:" + tree.minimum());
        System.out.println("===========");
        // 删除二叉搜索树中的最大值
        System.out.println("二叉树最大节点[删除前]:" + tree.maximum());
        System.out.println(tree.removeMax());
        System.out.println("二叉树最大节点[删除后]:" + tree.maximum());*/

        // 中序遍历
        // tree.inOrderNR();
        //tree.remove(3);
        //System.out.println(tree);
    }
}
