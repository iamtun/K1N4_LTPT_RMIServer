package service.impl;

import dao.OrderDAO;
import entity.Order;
import service.IOrderService;

public class OrderServiecImpl implements IOrderService{
	private OrderDAO dao;
	
	
	public OrderServiecImpl() {
		super();
		this.dao = new OrderDAO();
	}


	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		return dao.findOrderById(id);
	}

}
