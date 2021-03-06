package com.springreact.fullstack.dto;

import java.time.LocalDate;

import com.springreact.fullstack.entities.Sale;

public class SaleDTO {
	
	private Long id;
	private Integer deals;
	private Integer visited;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;

	public SaleDTO() {
	}

	public SaleDTO(Long id, Integer deals, Integer visited, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.deals = deals;
		this.visited = visited;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
	

}
