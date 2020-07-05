package edu.patronesdiseno.srp.models.interfaces;

import edu.patronesdiseno.srp.models.*;

public interface IOrderItem {
    Order order = null;
    Product product = null;
    Integer quantity = null;
    Double price = null;

    public Double calculatePrice();

    public Order getOrder();

    public void setOrder(Order order);

    public Product getProduct();

    public Integer getQuantity();

    public Double getPrice();

}