package com.te.e_comSpringRest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name = "items_info")
@XmlRootElement(name = "items-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("items_info")
public class Item implements Serializable {

	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
}

