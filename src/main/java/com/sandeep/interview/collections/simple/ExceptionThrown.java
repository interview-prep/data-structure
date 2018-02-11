package com.sandeep.interview.collections.simple;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Sandeep on 2/11/2018.
 */

class Base {

    public void bMethod() throws IOException, SQLException {

    }
}

class Children extends Base {
    public void bMethod() throws NullPointerException, IOException, SQLException {
        // SQLException must be thrown from both parent and Child as it is Checked exception
        // but child can throw only non checked exception

    }
}

public class ExceptionThrown {
}


/*
11.How to achieve Overriding ?
        The argument list must exactly match the overridden method
        Return type must be the same or subtype of the overridden method
        Access levels can’t be more restrictive than the overridden method
        Access level can be less restrictive than overridden method
        Overriding method can throw unchecked(runtime) exceptions regardless of whether the overridden methods declares the exception
        Overriding method must not throw new or broader Checked exceptions
        Overriding method can throw narrower or fewer exceptions
        You can not override a method marked final
        You can not override a method marked Static
        If a method can’t be inherited, it can’t be overridden
        Superclass version of an overridden method can be invoked using super.methodname();

12.What is Overloading ?
        overloaded methods must change argument list
        overloaded methods can change return type
        overloaded methods can change access modifier
        overloaded methods can declare new or broader checked exceptions
        A method can be overloaded in the same class or in a subclass*/
