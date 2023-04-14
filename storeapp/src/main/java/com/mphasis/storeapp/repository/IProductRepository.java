package com.mphasis.storeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.storeapp.domain.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>{

}
