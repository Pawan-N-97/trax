package com.trax.util;

public interface EmailService {
	
    public void sendSimpleMessage(
    	      String to, String subject, String text);
}
