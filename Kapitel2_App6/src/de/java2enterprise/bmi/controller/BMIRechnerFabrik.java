package de.java2enterprise.bmi.controller;

public class BMIRechnerFabrik {
	public final static int WS_WINTER = 1;
	public final static int WS_SOMMER = 2;
	
	public static BMIRechner createInstance(int ws_schalter) {
		if(ws_schalter == WS_WINTER) {
			return new BMIRechnerImpl().new BMIWinterRechnerImpl();
		}
		return new BMIRechnerImpl().new BMISommerRechnerImpl();	
	}
}
