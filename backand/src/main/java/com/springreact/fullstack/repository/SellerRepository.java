package com.springreact.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.fullstack.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
