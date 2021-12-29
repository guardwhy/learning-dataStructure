package cn.set.demo;

// 底层由链表实现的集合
public class LinkedSet<E> implements Set<E>{
    private LinkedList<E> list;
    // 创建LinkedSet对象
    public LinkedSet(){
        list = new LinkedList<>();
    }

    /***
     * 向集合中添加一个元素element 如果元素已存在则不添加
     * @param element
     */
    @Override
    public void add(E element) {
        if(!list.contains(element)){
            list.add(element);
        }
    }

    @Override
    public void remove(E element) {
        list.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


    @Override
    public String toString() {
        return list.toString();
    }
}
