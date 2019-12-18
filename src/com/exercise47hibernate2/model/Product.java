package com.exercise47hibernate2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="productos")		//Para saber que esta será la tabla
public class Product {

	@Id 		//Para primary key
	@Column(name="idProducto")
	private int idProduct;
	
	@Column(name="nombreProducto")
	private String nameProduct;
	
	@Column(name="precioProducto")
	private double priceProduct;
	
	
	public Product() {
		
	}


	public Product(int idProduct, String nameProduct, double priceProduct) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}


	public int getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}


	public String getNameProduct() {
		return nameProduct;
	}


	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}


	public double getPriceProduct() {
		return priceProduct;
	}


	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}


	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", priceProduct=" + priceProduct
				+ "]";
	}
	
	
	
	
	
	
	
	
}
