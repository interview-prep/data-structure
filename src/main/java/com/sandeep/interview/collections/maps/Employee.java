package com.sandeep.interview.collections.maps;

/**
 * Created by Sandeep on 2/10/2017.
 */
public class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {/*
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;*/
        return false;

    }

    @Override
    public int hashCode() {
        /*int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;*/
        return 1;
    }
}
