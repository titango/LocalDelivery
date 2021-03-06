package main.java.model;

import java.io.Serializable;
import java.util.ArrayList;

public class EventAction implements Serializable {
	public int eventType;
	public int requireId;
	public int statusCode; // 1: success // 0: fail;
	public User user;
	public Order newOrder;
	public ArrayList<OrderDetail> newOrderDetail;
	public GenericAVLTree<Order> order_list;
	public GenericDLinkedList<Goods> goods_list;
	public GenericDLinkedList<OrderDetail> order_detail_list;
}
