package com.veggievibes.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veggievibes.backend.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
