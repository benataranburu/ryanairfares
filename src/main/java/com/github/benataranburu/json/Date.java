package com.github.benataranburu.json;

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
"dateOut",
"flights"
})
public class Date {

@JsonProperty("dateOut")
private String dateOut;
@JsonProperty("flights")
private List<Flight> flights = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("dateOut")
public String getDateOut() {
return dateOut;
}

@JsonProperty("dateOut")
public void setDateOut(String dateOut) {
this.dateOut = dateOut;
}

@JsonProperty("flights")
public List<Flight> getFlights() {
return flights;
}

@JsonProperty("flights")
public void setFlights(List<Flight> flights) {
this.flights = flights;
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
