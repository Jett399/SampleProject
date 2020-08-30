package com.jett.sample.di;

import org.junit.Test;

/**
 * @Class: IOC
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-8:16 AM
 */
public class IOC {

    @Test
    public  void test() {
        Person person = new Person();
        //这里想开什么车，括号里面就传什么车， 实现了IOC
        person.drive(new Car());
    }

    static  class Person{

        void drive(Drivable drivable){
            drivable.drive();
        }
    }


    static class Bike implements Drivable{
        @Override
        public void drive() {
            System.out.println("骑自行车");
        }
    }

    static class Car implements Drivable{

        @Override
        public void drive() {
            System.out.println("开汽车");
        }
    }

    static class Boat implements Drivable{

        @Override
        public void drive() {
            System.out.println("开轮船");
        }
    }

    interface Drivable {
            void drive() ;
    }

}
