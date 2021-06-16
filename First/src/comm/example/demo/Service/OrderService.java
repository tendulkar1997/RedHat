package comm.example.demo.Service;

import java.util.List;
import java.util.Set;

import comm.example.demo.model.Order;

public interface OrderService {
	
	
	public Order createOrder(Order order);
	public List<Order> getAllOrder();
}