package com.promineotech.inventoryManagementApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagementApi.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
