package com.bean;

/**
 * @author Miskai
 * @date 2019/4/4
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setA7ge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        /*
 重写equals方法的要求：
1、自反性：对于任何非空引用x，x.equals(x)应该返回true。
2、对称性：对于任何引用x和y，如果x.equals(y)返回true，那么y.equals(x)也应该返回true。
3、传递性：对于任何引用x、y和z，如果x.equals(y)返回true，y.equals(z)返回true，那么x.equals(z)也应该返回true。
4、一致性：如果x和y引用的对象没有发生变化，那么反复调用x.equals(y)应该返回同样的结果。
5、非空性：对于任意非空引用x，x.equals(null)应该返回false。
        */
        //非空性
        if (obj != null && obj.getClass() == this.getClass()) {
            Person p = (Person) obj;
            //自反性
            if (this == p) {
                return true;
            }
            if (p.getName() != null  || null != getName()) {
                return this.getName().equalsIgnoreCase(p.getName().trim()) && this.getAge() == p.getAge();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
