package com.example.restapi.models;


import java.util.List;
import java.util.Optional;

import com.example.restapi.models.data.Page;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PageRepository extends JpaRepository<Page, Integer> 
{
    Optional<Page> findBySlug(String slug);
    Page findBySlugAndIdNot(String slug, int id);
    Page findById(int id);
    List<Page> findAllByOrderBySortingAsc();
}
