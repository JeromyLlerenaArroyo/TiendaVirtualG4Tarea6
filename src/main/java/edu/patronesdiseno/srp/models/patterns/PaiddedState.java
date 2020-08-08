package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class PaiddedState implements OrderState {

    public PaiddedState(){}

    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void prev(Order order) {
        order.setState(new OrderedState());
    }

    @Override
    public void printStatus(){
        System.out.println("Order Paidded!");
    }
}