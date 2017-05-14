package com.sandeep.interview.collections.container;

/**
 * Created by Sandeep on 2/13/2017.
 */
/*
Can we break singleton?

Answer-Yes,one can create multiple objects using
Serialization/deserialization if singleton
class is marked as serializable.So we should not mark singleton
class as serializable and in case
class is serializable via inheritance,override readObject()method and throw Non serializable exception.
        Cloning-if singleton
class is marked as cloneable.So we should not mark singleton
class as Cloneable and if
class is cloneable (by parent class),override clone method and throw CloneNotSupported exception.
        Using reflection as reflection can access private fields.So we can apply check in constructor and throw exception if instance is not created from constructor.

link :http://www.wideskills.com/java-interview-questions/java-singleton-interviw-questions
*/

public class SingletonCenturyLink {
    private static final String sr = "asdsa";
    private String sr1 = sr;
    private static final SingletonCenturyLink sinleton_inst = new SingletonCenturyLink();
    public static final Boolean have_Instance = true;
//    private final Boolean inst_Avail = have_Instance;
    private static final Boolean inst_Avail = have_Instance;

    private SingletonCenturyLink() {
        System.out.println(inst_Avail);
        System.out.println(sr1);
    };

    public final Boolean isInstAvail() {
//        inst_Avail = have_Instance;
        return inst_Avail;
    }

    public static void main(String[] args) {
        System.out.println(sinleton_inst.isInstAvail() );
        System.out.println(sinleton_inst.isInstAvail() ? "Instance is there." : "No instance");
    }
}
