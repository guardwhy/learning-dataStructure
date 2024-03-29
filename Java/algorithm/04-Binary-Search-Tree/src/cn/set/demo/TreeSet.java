package cn.set.demo;

//底层由二分搜索树来实现的集合 有序 自然排序
public class TreeSet<E extends Comparable<E>> implements Set<E>{

    private BinarySearchTree<E> tree;

    TreeSet(){
        tree = new BinarySearchTree<>();
    }
    @Override
    public void add(E element) {
        tree.add(element);
    }

    @Override
    public boolean contains(E element) {
        return tree.contains(element);
    }

    @Override
    public void remove(E element) {
        tree.remove(element);
    }

    @Override
    public int size() {
        return tree.size();
    }

    @Override
    public boolean isEmpty() {
        return tree.isEmpty();
    }

    @Override
    public String toString() {
       return tree.toString();
    }
}
