package com.angelbroking.smartapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * A wrapper for user id, access token, refresh token.
 */
public class TokenSet {

	@SerializedName("clientcode")
	public String userId;
	@SerializedName("access_token")
	public String accessToken;
	@SerializedName("refresh_token")
	public String refreshToken;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

}
