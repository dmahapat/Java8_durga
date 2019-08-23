package com.interview;

enum TrafficSignal {
	// This will call enum constructor with one
    // String argument
	RED("STOP"),AMBER("READY"),GREEN("GO");
	
	// declaring private variable for getting values
    private String action;
    
    // getter method
    public String getAction() {
    	return this.action;
    }
    
    private TrafficSignal(String action) {
    	this.action = action;
    }
}

public class EnumCustomValuesExample {
	
	public static void main(String[] args) {
		TrafficSignal[] trafficSignals = TrafficSignal.values();
		for (TrafficSignal trafficSignal : trafficSignals) {
			System.out.println("NAME: "+trafficSignal.name()+" | VALUE: "+trafficSignal.getAction());
		}
	}

}
