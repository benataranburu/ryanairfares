package com.github.benataranburu.ryanairfares.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"flightNumber",
"time",
"timeUTC",
"duration",
"faresLeft",
"flightKey",
"infantsLeft",
"regularFare",
"businessFare",
"leisureFare"
})
public class Flight {

@JsonProperty("flightNumber")
private String flightNumber;
@JsonProperty("time")
private List<String> time = null;
@JsonProperty("timeUTC")
private List<String> timeUTC = null;
@JsonProperty("duration")
private String duration;
@JsonProperty("faresLeft")
private Integer faresLeft;
@JsonProperty("flightKey")
private String flightKey;
@JsonProperty("infantsLeft")
private Integer infantsLeft;
@JsonProperty("regularFare")
private RegularFare regularFare;
@JsonProperty("businessFare")
private BusinessFare businessFare;
@JsonProperty("leisureFare")
private LeisureFare leisureFare;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("flightNumber")
public String getFlightNumber() {
return flightNumber;
}

@JsonProperty("flightNumber")
public void setFlightNumber(String flightNumber) {
this.flightNumber = flightNumber;
}

@JsonProperty("time")
public List<String> getTime() {
return time;
}

@JsonProperty("time")
public void setTime(List<String> time) {
this.time = time;
}

@JsonProperty("timeUTC")
public List<String> getTimeUTC() {
return timeUTC;
}

@JsonProperty("timeUTC")
public void setTimeUTC(List<String> timeUTC) {
this.timeUTC = timeUTC;
}

@JsonProperty("duration")
public String getDuration() {
return duration;
}

@JsonProperty("duration")
public void setDuration(String duration) {
this.duration = duration;
}

@JsonProperty("faresLeft")
public Integer getFaresLeft() {
return faresLeft;
}

@JsonProperty("faresLeft")
public void setFaresLeft(Integer faresLeft) {
this.faresLeft = faresLeft;
}

@JsonProperty("flightKey")
public String getFlightKey() {
return flightKey;
}

@JsonProperty("flightKey")
public void setFlightKey(String flightKey) {
this.flightKey = flightKey;
}

@JsonProperty("infantsLeft")
public Integer getInfantsLeft() {
return infantsLeft;
}

@JsonProperty("infantsLeft")
public void setInfantsLeft(Integer infantsLeft) {
this.infantsLeft = infantsLeft;
}

@JsonProperty("regularFare")
public RegularFare getRegularFare() {
return regularFare;
}

@JsonProperty("regularFare")
public void setRegularFare(RegularFare regularFare) {
this.regularFare = regularFare;
}

@JsonProperty("businessFare")
public BusinessFare getBusinessFare() {
return businessFare;
}

@JsonProperty("businessFare")
public void setBusinessFare(BusinessFare businessFare) {
this.businessFare = businessFare;
}

@JsonProperty("leisureFare")
public LeisureFare getLeisureFare() {
return leisureFare;
}

@JsonProperty("leisureFare")
public void setLeisureFare(LeisureFare leisureFare) {
this.leisureFare = leisureFare;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}