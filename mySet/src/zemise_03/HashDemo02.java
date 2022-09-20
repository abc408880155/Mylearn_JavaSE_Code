package zemise_03;

import java.util.HashSet;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台
        遍历该集合要求：学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1：定义学生类
        2：创建HashSet集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合（增强for）
        6: 在学生类中重写两个方法
            hashCode()和equals()
            自动生成即可
 */
public class HashDemo02 {
    public static void main(String[] args) {
        //2：创建HashSet集合对象
        HashSet<Student> hs = new HashSet<>();

        //3：创建学生对象
        Student s1 = new Student("张曼玉",22);
        Student s2 = new Student("林黛玉",21);
        Student s3 = new Student("王祖贤",23);
        Student s4 = new Student("薛宝钗",24);
        Student s5 = new Student("张曼玉",22);

        //4：把学生添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        //5：遍历集合（增强for）
        for(Student s:hs){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
