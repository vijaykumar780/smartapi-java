package com.angelbroking.smartapi.sample;

import com.angelbroking.smartapi.SmartConnect;
import com.angelbroking.smartapi.http.exceptions.SmartAPIException;
import com.angelbroking.smartapi.models.User;

public class LoginWithTOTPSample {
	
	public static void main(String[] args) throws SmartAPIException, Exception {
		String clientID = "V122968";
		String clientPass = "japantokyo8";
		String apiKey = "WHh3Izj3";
		String totp = "857868";
		SmartConnect smartConnect = new SmartConnect(apiKey);
		User user = smartConnect.generateSession(clientID, clientPass, totp);
		String feedToken = user.getFeedToken();
		System.out.println(feedToken);
	}
}
