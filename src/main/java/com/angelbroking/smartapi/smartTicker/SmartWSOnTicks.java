package com.angelbroking.smartapi.smartTicker;

import org.json.JSONArray;

public interface SmartWSOnTicks {
	void onTicks(JSONArray ticks);
}
