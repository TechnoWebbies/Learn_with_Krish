package com.java.soap;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class CartService {
	
	private static Cart cart = new Cart();
	
	public Cart getCart() {

		return cart;
	}
	public Cart updateCart(int addItem, int removeItem) {
		cart.addItem = addItem;
		cart.removeItem = removeItem;
		
		return cart;
		
	}
	
	@WebMethod(operationName = "resetCart")
	public void reset() {
		cart.addItem = cart.removeItem = 0;
	}
	
	public int increaseaddItem() {return ++ cart.addItem;}
	public int increaseremoveItem() {return ++ cart.removeItem;}
	
	public int getaddItem() {return  cart.addItem;}
	public int getremoveItem() {return  cart.removeItem;}
}
