package com.pika.Onlinegrocerystore.Services;

import com.pika.Onlinegrocerystore.dao.ICustomerDao;
import com.pika.Onlinegrocerystore.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

//// elliott added following line on Sept.4
//@Repository
public interface CustomerService {

    Customer findById(Long id);
    List<Customer> findAll();
    void update(Customer customer);
    void create(Customer customer);
    void deleteById(Long id);
    List<Customer> findByName(String name);
    Customer checkLogin(String name, String password);

}
