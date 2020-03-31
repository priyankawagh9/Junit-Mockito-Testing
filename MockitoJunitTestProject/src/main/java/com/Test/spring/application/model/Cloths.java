package com.Test.spring.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.context.properties.bind.DefaultValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloths {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int clothsId;
	
	String clothType;
	Long basePrice;
	float percentProfit = 5.0f;
	Boolean sold = false;
	Date purchaseDate;
	Date sellingDate = null;
	int numberOfClothsInStock=0;
}
