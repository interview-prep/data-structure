package com.sandeep.interview.collections.simple;

/**
 * Created by Sandeep on 2/11/2018.
 */
class Outer {

    private int x = 100;

    class Inner {
        private int x = 200;

        public void methodInner() {
            System.out.println("hi outer from inner " + Outer.this.x);
            System.out.println("hi inner " + this.x);
        }
    }

    public void methodOuter() {
        Inner inner = new Inner();
        inner.methodInner();
    }
}


class MyOuter {
    private int xxxx = 1020;

    void doStuff() {
        int yyyy = 222;//not private
        class MyInner {
            int zzzz =3333;
            void methodInner(){
                System.out.println("dfhsdjfhkjds : " + xxxx);
                System.out.println("dfhsdjfhkjds : " + yyyy);
                System.out.println("dfhsdjfhkjds : " + zzzz);
            }
        }
        MyInner inner = new MyInner();
    }
//    MyInner inner = new MyInner(); cannot access inner class of a method outside
}


public class InnerClassExamples {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.methodOuter();

        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }

}
