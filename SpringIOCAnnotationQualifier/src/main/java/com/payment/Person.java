package com.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier("online")
	Online on;
	
	@Autowired
	@Qualifier("offline")
	Offline off;

	public Online getOn() {
		return on;
	}

	public void setOn(Online on) {
		this.on = on;
	}

	public Offline getOff() {
		return off;
	}

	public void setOff(Offline off) {
		this.off = off;
	}

	@Override
	public String toString() {
		return "MyClassQualifier [on=" + on + ", off=" + off + "]";
	}
	
	

}
