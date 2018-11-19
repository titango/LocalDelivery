package main.java.model;

import java.util.ArrayList;

/**
 * This model is used in Client Frame Main
 */
public class ClientModel{

    private User loginUser;
    private GenericBinarySearchTree<Order> orderList;
    private GenericDLinkedList<OrderDetail> orderListDetail;
    private GenericDLinkedList<Goods> goodsList;
    private ArrayList<Integer> orderIdList;

    public ClientModel()
    {
        loginUser = null;
        orderList = null;
        orderListDetail = null;
        goodsList = null;
        orderIdList = new ArrayList<>();
    }

    public User getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }

    public GenericBinarySearchTree<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(GenericBinarySearchTree<Order> orderList) {
        this.orderList = orderList;
    }

    public GenericDLinkedList<OrderDetail> getOrderListDetail() {
        return orderListDetail;
    }

    public void setOrderListDetail(GenericDLinkedList<OrderDetail> orderListDetail) {
        this.orderListDetail = orderListDetail;
    }

    public GenericDLinkedList<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(GenericDLinkedList<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public ArrayList<Integer> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(ArrayList<Integer> orderIdList) {
        this.orderIdList = orderIdList;
    }
}