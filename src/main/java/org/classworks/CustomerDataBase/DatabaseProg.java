package org.classworks.CustomerDataBase;


import org.classworks.CustomerDataBase.Customer;

import java.sql.Timestamp;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DatabaseProg {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nagendra", "nagen@gmail.com", 20, "Fremont", 12, new Timestamp(new Date().getTime() + 191));
        Customer customer2 = new Customer("bibhu", "bibhu@gmail.com", 24, "Irving", 60, new Timestamp(new Date().getTime() + 12391));
        Customer customer3 = new Customer("bidur", "bidur@gmail.com", 36, "Texas", 40, new Timestamp(new Date().getTime() + 22));
        Customer customer5 = new Customer("sarjan", "sarjan@gmail.com", 24, "Nepal", 100, new Timestamp(new Date().getTime() + 345));
        Customer customer6 = new Customer("bib", "bib@gmail.com", 24, "thachiana", 222, new Timestamp(new Date().getTime() + 77667));
        Customer customer7 = new Customer("bibhu", "bibhu@gmail.com", 24, "Irving", 66, new Timestamp(new Date().getTime() + 33));
        Customer customer8 = new Customer("sarjan", "sarjan@gmail.com", 24, "Nepal", 130, new Timestamp(new Date().getTime() + 77));

        List<Customer> customers = Arrays.asList(customer1, customer2, customer3, customer5, customer6, customer7, customer8);

        Comparator<Customer> compareByTime = Comparator.comparing(Customer::getTimestamp);

        List<Customer> sortedCustomers = customers.stream().sorted(compareByTime).collect(Collectors.toList());
        //sortedCustomers = customers.stream().sorted(Comparator.comparing(Customer::getAge)).collect(Collectors.toList());
        Collections.sort(sortedCustomers);

        Map<Customer, List<Integer>> distinctCustomers = new TreeMap<>();
        distinctCustomers = sortedCustomers.stream().
                collect(Collectors.groupingBy(Function.identity(),                      //key
                        Collectors.mapping(Customer::getMarks, Collectors.toList()))); //value is the marks and will be shown in the []


        /*Map<Customer, List<Integer>> finalcustomerEmailList = new TreeMap<Customer, List<Integer>>();

        finalcustomerEmailList.putAll(distinctCustomers);*/

       /* Map<Customer, List<Integer>> customerEmailList =
                //List<Customer> = doe
                customers.stream(). //Stream<Customer>
                        sorted((t1,t2)->t2.getDoe().compareTo(t1.getDoe())). ///Stream<Customer> but it sorted as per doe descending
                        collect(Collectors.groupingBy(Function.identity(),
                        Collectors.mapping(Customer::getMarks, Collectors.toList())));
        customers.stream().distinct().collect(Collectors.toSet());*/

        distinctCustomers.forEach((key, value) ->
            System.out.println(" key = " + key + " , value = " + value));


    }
}
