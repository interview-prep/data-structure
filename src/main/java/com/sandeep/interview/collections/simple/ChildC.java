package com.sandeep.interview.collections.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sandeep on 2/10/2018.
 */
class ParentC {

    private List<String> l = new ArrayList();

    protected void methodOverRideRestriction() {}
    protected void methodOverRideRestriction(int x) {
        System.out.println("ParentC :: methodOverRideRestriction");
        l.add("dfds");
        l.stream().forEach(r -> {
            System.out.println(r);
        });
    }

    private void meth() {

    }
}

public class ChildC extends ParentC {
    //method access previllage cannot be lower then protected like private but it can be public

    public void methodOverRideRestriction() {
        System.out.println("ChildC :: methodOverRideRestriction");
        try {
//            System.exit(1); // jvm exits so finally will not be called
        } finally {
            System.out.println("finally");
        }
    }

    static {
        System.out.println("imstatic"); // runs always
    }

    public void meth() {// no error because not known to parents.

    }

    public static void main(String[] args) {
        ChildC c = new ChildC();
        System.out.println(c instanceof ParentC);//true
        System.out.println(c instanceof ChildC); // true

//        ChildC cp = new ParentC(); not possible because parent is not child
        c.methodOverRideRestriction();

        ParentC pc = new ChildC();
        System.out.println(pc instanceof ParentC); // true
        System.out.println(pc instanceof ChildC); // true
        pc.methodOverRideRestriction(9);//invokes ParentC because pc is ParentC here
        pc.methodOverRideRestriction();//invokes child because pc is ParentC reference but runtime it will resolve to ChildC
//        (ChildC)pc.methodOverRideRestriction();

        ChildC ddd = (ChildC) pc; // downcasting ; pc is ParentC
        ParentC p = new ParentC();
        System.out.println(p instanceof ParentC); // true
        System.out.println(p instanceof ChildC); // false
    }
}