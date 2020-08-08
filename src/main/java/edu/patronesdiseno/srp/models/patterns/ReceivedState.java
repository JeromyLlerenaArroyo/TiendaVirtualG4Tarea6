package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class ReceivedState implements OrderState {

    public ReceivedState(){}

    @Override
    public void next(Order order) {
        order.setState(new FinalState());
    }

    @Override
    public void prev(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void printStatus(){
        System.out.println("Order Received!");
    }
}