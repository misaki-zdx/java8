package com.misaki;

import com.bean.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void f1() {
        persons.add(new Person("jack", 20));
        persons.add(new Person("mike", 25));
        persons.add(new Person("tom", 30));
        List<Person> collect = persons.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void f2() {
        persons.add(new Person("jack", 20));
        persons.add(new Person("mike", 25));
        persons.add(new Person("tom", 30));
        persons.add(new Person("tom", 30));
        persons.add(new Person("tom", 30));
        //需要先定义好 equals 方法，不然类似[Person{name='jack', age=20}, Person{name='jack', age=20}] 这样的情况是不会处理的
        List<Person> collect = persons.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void f3() {
        Person tom = new Person("tom", 30);
        Person tom1 = new Person("tom", 30);
        System.out.println(tom.equals(tom1));
    }

}
