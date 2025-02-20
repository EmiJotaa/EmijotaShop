package com.dev.emijotashop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.emijotashop.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
