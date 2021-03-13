package com.promineotech.inventoryManagementApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagementApi.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
