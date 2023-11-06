package com.angelbroking.smartapi.smartTicker;

import com.angelbroking.smartapi.http.exceptions.SmartAPIException;

public interface SmartWSOnError {

	public void onError(Exception exception);

	public void onError(SmartAPIException smartAPIException);

	void onError(String error);
}
 