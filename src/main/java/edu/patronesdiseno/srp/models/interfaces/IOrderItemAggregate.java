package edu.patronesdiseno.srp.models.interfaces;
import edu.patronesdiseno.srp.models.patterns.OrderItemIterator;

public interface IOrderItemAggregate {
    public OrderItemIterator createIterator();
}