package burp.faraday.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedObjectEntity {

    @JsonProperty("_id")
    private int id;

    public CreatedObjectEntity() {

    }

    public CreatedObjectEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CreatedObjectEntity{" +
                "id=" + id +
                '}';
    }
}
