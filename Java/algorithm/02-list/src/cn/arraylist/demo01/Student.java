package cn.arraylist.demo01;

public class Student implements Comparable<Student>{
    // 成员变量
    private String username;
    private int userage;
    // 构造方法
    public Student(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    @Override
    public int compareTo(Student o) {
        return o.userage - this.userage;
    }

    @Override
    public boolean equals(Object student) {
        if(this == student)
            return true;

        if(student == null)
            return false;

        if(this.getClass() != student.getClass())
            return false;

        Student o = (Student)student;
        return this.userage == o.userage;
    }

    @Override
    public String toString() {
        return String.format("Student[姓名:%s, 年龄:%d]", username, userage);
    }

    public static void main(String[] args) {
        // 创建list对象
        ArrayList<Student> list = new ArrayList<>();
        // 往数组中添加元素
        list.addLast(new Student("guardwhy", 10));
        list.addLast(new Student("curry", 12));
        list.addLast(new Student("james", 38));
        // System.out.println(list);

        for(Student s : list){
            System.out.println(s);
        }
    }
}
