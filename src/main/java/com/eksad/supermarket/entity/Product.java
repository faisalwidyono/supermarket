package com.eksad.supermarket.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")

public class Product 
{
	@Id
/*	@GeneratedValue(strategy = GenerationType.SEQUENCE,
		generator = "product_id")
	@SequenceGenerator(name = "product_id",
		sequenceName = "product_id_seq",
		allocationSize = 1) */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private BigDecimal price;

}
