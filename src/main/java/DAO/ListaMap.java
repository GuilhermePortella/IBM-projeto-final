package DAO;

import Controller.MapJson;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class ListaMap implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<MapJson> value;
    @JsonProperty("@odata.context")
    private String odatacontext;

    public List<MapJson> getValue( ) {
        return value;
    }

    public void setValue(List<MapJson> value) {
        this.value = value;
    }
}