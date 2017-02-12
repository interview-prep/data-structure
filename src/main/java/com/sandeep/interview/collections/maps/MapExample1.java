package com.sandeep.interview.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sandeep on 2/10/2017.
 */
public class MapExample1 {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sandeep");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("Sandeep1");
        employeeMap.put(1,employee);
        employeeMap.put(2,employee1);

        System.out.println(employeeMap.size());
        System.out.println(employeeMap.get(employee1));

        Map<Employee, Employee> employeeObjectMap = new HashMap<Employee, Employee>();
        Employee employee3 = new Employee();
        employee3.setId(1);
        employee3.setName("Sandeep");

        Employee employee4 = new Employee();
        employee4.setId(2);
        employee4.setName("Sandeep1");
        employeeObjectMap.put(employee3,employee3);
        employeeObjectMap.put(employee4,employee4);

        System.out.println(employeeObjectMap.size());
        System.out.println(employeeObjectMap.get(employee3));

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put(null, 1000);
        System.out.println(map.get(null)); //Prints 1000
    }
}
