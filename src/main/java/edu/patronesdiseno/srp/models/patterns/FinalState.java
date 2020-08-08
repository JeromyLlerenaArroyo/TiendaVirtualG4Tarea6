package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class FinalState implements OrderState {

    public FinalState(){}

    @Override
    public void next(Order order) {
        System.out.println("This order has already finished.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new PaiddedState());
    }

    @Override
    public void printStatus(){
        System.out.println("Finished!");
    }
}