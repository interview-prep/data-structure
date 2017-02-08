package com.sandeep.interview.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sandeep on 2/8/2017.
 */
public class Customer {

    private long crmID;
    private int nameSpace;

    public Customer(long crmID, int nameSpace) {
        super();
        this.crmID = crmID;
        this.nameSpace = nameSpace;
    }

    public boolean equals(Object obj) {
        //null instanceof Object will always return false
        if (!(obj instanceof Customer))
            return false;
        if (obj == this)
            return true;
        return  this.crmID == ((Customer) obj).crmID &&
                this.nameSpace == ((Customer) obj).nameSpace;
    }

   /* public int hashCode(){
        int result = 0;
        result= (int)(crmID/12) + nameSpace;
        return result;
    }*/
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(new Customer(2345891234L,0),"Sandeep M Sanmay");
        m.put(new Customer(2345891231L,0),"Sandeep M Sanmay1");
        System.out.println(m.get(new Customer(2345891234L,0)));
        System.out.println(m.get(new Customer(2345891231L,0)));
    }
}
