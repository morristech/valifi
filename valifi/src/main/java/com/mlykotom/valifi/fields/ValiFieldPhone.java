package com.mlykotom.valifi.fields;

import android.support.annotation.StringRes;

import com.mlykotom.valifi.ValiFi;


public class ValiFieldPhone extends ValiFieldText {
	public ValiFieldPhone() {
		this(null);
	}


	public ValiFieldPhone(String defaultValue) {
		super(defaultValue);
		addPhoneValidator(getAppContext().getString(getErrorRes(ValiFi.Builder.ERROR_RES_PHONE)));
	}


	public ValiFieldPhone(@StringRes int errorResource) {
		this(null, errorResource);
	}


	public ValiFieldPhone(String defaultValue, @StringRes int errorResource) {
		super(defaultValue);
		addPhoneValidator(getAppContext().getString(errorResource));
	}


	public ValiFieldPhone(String defaultValue, String errorMessage) {
		super(defaultValue);
		addPhoneValidator(errorMessage);
	}


	/**
	 * Validates US or Czech phone numbers
	 *
	 * @param errorMessage specifies error message to be shown
	 * @return this, so validators can be chained
	 */
	protected ValiFieldText addPhoneValidator(String errorMessage) {
		addPatternValidator(errorMessage, getPattern(ValiFi.Builder.PATTERN_PHONE));
		return this;
	}
}
