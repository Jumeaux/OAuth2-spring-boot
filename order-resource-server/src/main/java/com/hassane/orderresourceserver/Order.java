package com.hassane.orderresourceserver;

public class Order {
    private Long id;
    private String productId;
    private String productUser;
    private int quantity;
    private OrderStatus orderStatus;


    public Order(Long id,String productId,String productUser,int quantity, OrderStatus orderStatus ){
        this.id=id;
        this.productId=productId;
        this.productUser=productUser;
        this.quantity=quantity;
        this.orderStatus=orderStatus;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getProductId() {
        return productId;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getProductUser() {
        return productUser;
    }


    public void setProductUser(String productUser) {
        this.productUser = productUser;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    
}
