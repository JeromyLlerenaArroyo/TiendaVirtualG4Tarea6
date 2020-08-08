package edu.patronesdiseno.srp.models.patterns;
import edu.patronesdiseno.srp.models.interfaces.IOrderItemIterator;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;
import java.util.List;

public class OrderItemIterator implements IOrderItemIterator{
    List<IOrderItem> order_list; 
    int index = 0; 
  
    public  OrderItemIterator (List<IOrderItem> order_list) 
    { 
        this.order_list = order_list; 
    } 
    @Override
    public IOrderItem next() 
    { 
        IOrderItem order_item =  order_list.get(index); 
        index++; 
        return order_item; 
    } 

    @Override
    public boolean hasNext() 
    { 
        if (index >= order_list.size() || order_list.get(index) == null) 
            return false; 
        else
            return true; 
    } 
}