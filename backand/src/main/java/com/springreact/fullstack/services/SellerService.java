package com.springreact.fullstack.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreact.fullstack.dto.SellerDTO;
import com.springreact.fullstack.entities.Seller;
import com.springreact.fullstack.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x))
				.collect(Collectors.toList());
		
	}

}
