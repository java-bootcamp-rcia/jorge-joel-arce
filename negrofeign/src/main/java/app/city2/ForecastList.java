
package app.city2;

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
    "list"
})
public class ForecastList {

    @JsonProperty("list")
    private List<CitiesList> list = null;

    @JsonProperty("list")
    public java.util.List<CitiesList> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<CitiesList> list) {
        this.list = list;
    }


}
