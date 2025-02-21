package com.dev.emijotashop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.emijotashop.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
