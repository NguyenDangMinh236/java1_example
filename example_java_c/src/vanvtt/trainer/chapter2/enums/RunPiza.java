package vanvtt.trainer.chapter2.enums;

import vanvtt.trainer.chapter2.enums.Pizza.PizzaStatus;

public class RunPiza {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setStatus(PizzaStatus.READY);
		System.out.println(pizza.getStatus());
		
		System.out.println(pizza.getStatus().isOrdered());
		
		System.out.println(pizza.getStatus().getTimeToDelivery());
		
		Pizza testPz = new Pizza();
	    testPz.setStatus(Pizza.PizzaStatus.READY);
	   System.out.println(testPz.isDeliverable());
	}

}
