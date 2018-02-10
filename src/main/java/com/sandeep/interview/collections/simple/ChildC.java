package com.sandeep.interview.collections.simple;

/**
 * Created by Sandeep on 2/10/2018.
 */
class ParentC {
    protected void methodOverRideRestriction(){
        System.out.println("ParentC :: methodOverRideRestriction");
    }
}

public class ChildC extends ParentC {
    //method access previllage cannot be lower then protected like private but it can be public
    public void methodOverRideRestriction(){
        System.out.println("ChildC :: methodOverRideRestriction");
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
        pc.methodOverRideRestriction();//invokes child because pc is child here

        ParentC p = new ParentC();
        System.out.println(p instanceof ParentC); // true
        System.out.println(p instanceof ChildC); // false
    }
}