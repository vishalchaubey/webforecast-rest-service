package com.example.webforecast.model.WeatherForeCastDto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headline implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4322954702912429673L;
	
	@JsonProperty("EffectiveDate") 
	 private Date effectiveDate;
	 @JsonProperty("EffectiveEpochDate") 
	 private int effectiveEpochDate;
	 @JsonProperty("Severity") 
	 private int severity;
	 @JsonProperty("Text") 
	 private String text;
	 @JsonProperty("Category") 
	 private String category;
	 @JsonProperty("EndDate") 
	 private Date endDate;
	 @JsonProperty("EndEpochDate") 
	 private int endEpochDate;
	 @JsonProperty("MobileLink") 
	 private String mobileLink;
	 @JsonProperty("Link") 
	 private String link;
	 
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public int getEffectiveEpochDate() {
		return effectiveEpochDate;
	}

	public void setEffectiveEpochDate(int effectiveEpochDate) {
		this.effectiveEpochDate = effectiveEpochDate;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getEndEpochDate() {
		return endEpochDate;
	}

	public void setEndEpochDate(int endEpochDate) {
		this.endEpochDate = endEpochDate;
	}

	public String getMobileLink() {
		return mobileLink;
	}

	public void setMobileLink(String mobileLink) {
		this.mobileLink = mobileLink;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Headline [effectiveDate=" + effectiveDate + ", effectiveEpochDate=" + effectiveEpochDate + ", severity="
				+ severity + ", text=" + text + ", category=" + category + ", endDate=" + endDate + ", endEpochDate="
				+ endEpochDate + ", mobileLink=" + mobileLink + ", link=" + link + "]";
	}
	 
	}
