package com.angelbroking.smartapi.models;

import com.google.gson.annotations.SerializedName;

public class Gtt {
	@SerializedName("id")
	public Integer id;

	@SerializedName("tradingsymbol")
	public String tradingSymbol;

	@SerializedName("symboltoken")
	public String symbolToken;

	@SerializedName("exchange")
	public String exchange;

	@SerializedName("transactiontype")
	public String transactionType;

	@SerializedName("producttype")
	public String productType;

	@SerializedName("price")
	public Integer price;

	@SerializedName("quantity")
	public Integer quantity;

	@SerializedName("triggerprice")
	public Integer triggerPrice;

	@SerializedName("disclosedqty")
	public Integer disclosedQty;

	@SerializedName("timeperiod")
	public Integer timePeriod;
	
	@Override
	public String toString() {
		return "Gtt [id=" + id + ", tradingSymbol=" + tradingSymbol + ", symbolToken="
				+ symbolToken + ", exchange=" + exchange + ", transactionType=" + transactionType + ", productType=" + productType
				+ ", price=" + price + ", quantity=" + quantity + ", triggerPrice=" + triggerPrice + ", disclosedQty=" + disclosedQty
				+ ", timePeriod=" + timePeriod + "]";
	}
}
