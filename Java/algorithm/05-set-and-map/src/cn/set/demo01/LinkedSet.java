package cn.set.demo01;

public class LinkedSet<E> implements Set<E> {
    // 创建list
    private LinkedList<E> list;
    // 构造器
    public LinkedSet(){
        list = new LinkedList<>();
    }

    //向集合中添加一个元素element如果元素已存在则不添加
    @Override
    public void add(E e) {
        if(!list.contains(e)){
            list.addFirst(e);
        }
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    /*@Override
    public Iterator<E> iterator() {
        return list.iterator();
    }*/
}
