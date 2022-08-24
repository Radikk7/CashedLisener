package com.example.lisener.lisener;

public class Orderstatus {
    private Order order;
    private String status;// progress completed
    private String message;


    public Orderstatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public Orderstatus() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString(){
        return getOrder() + " " + getStatus() + " " + getMessage();
    }

}
