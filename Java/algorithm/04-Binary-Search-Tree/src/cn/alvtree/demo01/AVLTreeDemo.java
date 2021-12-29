package cn.alvtree.demo01;

import java.util.ArrayList;

public class AVLTreeDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile("src/pride-and-prejudice.txt", words)) {
            // 创建map对象
            AVLTree<String, Integer> map = new AVLTree<>();
            for (String word : words) {
                if (map.contains(word))
                    map.update(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }

            System.out.println("总单词个数: " + map.size());
            System.out.println("是否是二分搜索树:" + map.isBinarySearchTree());
            System.out.println("是否是平衡树(ALV): " + map.isBalanced());

            // 删除元素
            for (String word : words){
                map.remove(word);
                if(!map.isBinarySearchTree() || !map.isBalanced()){
                    throw new RuntimeException("该树非BinarySearchTree OR AVLTree");
                }
            }
        }
    }
}
