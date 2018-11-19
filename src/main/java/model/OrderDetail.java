package main.java.model;

import java.io.Serializable;

public class OrderDetail implements Serializable {

	public int orderDetailId;
	public int orderId;
	public int goodsId;
	public int quantity;
	
	public OrderDetail(int id, int orderId, int goodsId, int quantity) {
		this.orderDetailId = id;
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.quantity = quantity;
	}

    public OrderDetail(int orderId, int goodsId, int quantity) {
        this(0,orderId,goodsId,quantity);
    }

    public String displayOrderDetail()
    {
        String toReturn = "odID: " + orderDetailId + "- quantity: " + quantity + "- goodsId: " + goodsId;
        return toReturn;
    }
	
	
}