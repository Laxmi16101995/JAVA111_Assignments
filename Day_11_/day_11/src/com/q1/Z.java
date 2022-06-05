package com.q1;

public interface Z extends X,Y{
	
	void abstractMethodZ();
	
	@Override
	default void defaultMethodX() {
		System.out.println("inside defaultMethodX of z interface");

	}

}
