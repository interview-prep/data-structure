package com.sandeep.interview.collections.container;

/**
 * Created by Sandeep on 2/13/2017.
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
