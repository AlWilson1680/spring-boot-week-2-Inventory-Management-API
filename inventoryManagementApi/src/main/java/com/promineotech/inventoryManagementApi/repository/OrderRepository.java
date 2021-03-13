package com.promineotech.inventoryManagementApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagementApi.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
