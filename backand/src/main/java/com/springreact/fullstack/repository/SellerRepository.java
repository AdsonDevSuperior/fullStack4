package com.springreact.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreact.fullstack.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
