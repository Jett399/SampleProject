package com.jett.sample.di;

/**
 * @Class: Dependency
 * @Description: 依赖注入
 * @author: Jett
 * @Date: 8/30/20-8:00 AM
 */
public class Dependency {

    public static void main(String[] args) {
        Person person = new Person();
        person.buy(new House());
        person.buy(new Car());
    }


    static class Person{
        //依赖House
        public void buy(House house)  { }
        //表示依赖Car
        public void buy(Car car){ }
    }

    static class House{

    }

    static class Car{

    }

}

