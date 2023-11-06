package com.angelbroking.smartapi.utils;

/**
 * Contains all the Strings that are being used in the Smart API Connect library.
 */
public class Constants {

    /** Product types. */
	public static String PRODUCT_DELIVERY = "DELIVERY";
	public static String PRODUCT_INTRADAY = "INTRADAY";
	public static String PRODUCT_MARGIN = "MARGIN";
	public static String PRODUCT_BO = "BO";
	public static String PRODUCT_CARRYFORWARD = "CARRYFORWARD";

    /** Order types. */
    public static String ORDER_TYPE_MARKET = "MARKET";
    public static String ORDER_TYPE_LIMIT = "LIMIT";
    public static String ORDER_TYPE_STOPLOSS_LIMIT = "STOPLOSS_LIMIT";
    public static String ORDER_TYPE_STOPLOSS_MARKET = "STOPLOSS_MARKET";

    /** Variety types. */
    public static String VARIETY_NORMAL = "NORMAL";
    public static String VARIETY_AMO = "AMO";
    public static String VARIETY_STOPLOSS = "STOPLOSS";
    public static String VARIETY_ROBO = "ROBO";
    
    /** Transaction types. */
    public static String TRANSACTION_TYPE_BUY = "BUY";
    public static String TRANSACTION_TYPE_SELL = "SELL";

    /** Duration types. */
    public static String DURATION_DAY = "DAY";
    public static String DURATION_IOC = "IOC";

    /** Exchanges. */
    public static String EXCHANGE_NSE = "NSE";
    public static String EXCHANGE_BSE = "BSE";
    public static String EXCHANGE_NFO = "NFO";
    public static String EXCHANGE_CDS = "CDS";
    public static String EXCHANGE_NCDEX = "NCDEX";
    public static String EXCHANGE_MCX = "MCX";

}
