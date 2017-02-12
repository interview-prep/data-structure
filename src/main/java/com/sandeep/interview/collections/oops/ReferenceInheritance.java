package com.sandeep.interview.collections.oops;

/**
 * Created by Sandeep on 2/11/2017.
 */
class Owner {
    public void add(String x) {
        System.out.println("add owner");
    }

    public void setP(Owner o) {
        System.out.println("I am owner");
    }
    public void addOneMore(int x){
        System.out.println("add one more parent method");
    }
}

public class ReferenceInheritance extends Owner {
    public void setP(ReferenceInheritance r) {
        System.out.println("I am child");
    }

    public void add(String x) {
        System.out.println("add child");
    }

    public void addOneMore(int x){
        System.out.println("add one more child method");
    }
    public static void main(String[] args) {
        Owner o = new ReferenceInheritance();
        o.addOneMore(10);
        o.setP(o);// parent o =  new Owner() but not r = new Owner()
        o.setP(new ReferenceInheritance());// parent o = new Reference() also r = new Reference()
         o.add("ss"); // owner
        ReferenceInheritance r = new ReferenceInheritance();
        System.out.println(r instanceof Owner);
        System.out.println(o instanceof Owner);
        System.out.println(o instanceof ReferenceInheritance);
        o.setP(r);// parent
        r.setP(o);// child
        r.setP(o);//parent
        r.setP(r);// child
        r.add("ss"); // owner
    }
}