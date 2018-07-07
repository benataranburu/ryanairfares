package com.github.benataranburu.ryanairfares.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"vat",
"amt",
"total",
"code",
"qty"
})
public class MandatorySeatFee {

@JsonProperty("vat")
private Integer vat;
@JsonProperty("amt")
private Integer amt;
@JsonProperty("total")
private Integer total;
@JsonProperty("code")
private String code;
@JsonProperty("qty")
private Integer qty;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("vat")
public Integer getVat() {
return vat;
}

@JsonProperty("vat")
public void setVat(Integer vat) {
this.vat = vat;
}

@JsonProperty("amt")
public Integer getAmt() {
return amt;
}

@JsonProperty("amt")
public void setAmt(Integer amt) {
this.amt = amt;
}

@JsonProperty("total")
public Integer getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Integer total) {
this.total = total;
}

@JsonProperty("code")
public String getCode() {
return code;
}

@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

@JsonProperty("qty")
public Integer getQty() {
return qty;
}

@JsonProperty("qty")
public void setQty(Integer qty) {
this.qty = qty;
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
