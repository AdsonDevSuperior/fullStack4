package com.springreact.fullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springreact.fullstack.dto.SaleDTO;
import com.springreact.fullstack.entities.Sale;
import com.springreact.fullstack.repository.SaleRepository;
import com.springreact.fullstack.repository.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository SellerRepository;
	
//	Adicionando "SellerRepository.findAll()" para a JPA armazenar em cash acelerando a resposta da busca, para listas menores que 1000
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		SellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

}
