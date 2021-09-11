package com.springreact.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreact.fullstack.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
