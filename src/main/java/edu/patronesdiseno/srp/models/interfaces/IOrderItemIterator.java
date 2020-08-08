package edu.patronesdiseno.srp.models.interfaces;

public interface IOrderItemIterator {
    boolean hasNext();

    IOrderItem next();
}