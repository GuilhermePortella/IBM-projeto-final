package Controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 *
 * @author Guilherme
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"id", "Indicador", "Data",
    "DataReferencia", "Media", "Mediana",
    "DesvioPadrao", "CoeficienteVariacao",
    "Minimo", "Maximo", "numeroRespondentes", "baseCalculo"})


public class MapJson implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;

    @JsonProperty("Indicador")
    private String indicador;

    @JsonProperty("Data")
    private String data;

    @JsonProperty("DataReferencia")
    private String dataReferencia;

    @JsonProperty("Media")
    private double media;

    @JsonProperty("Mediana")
    private double mediana;

    @JsonProperty("DesvioPadrao")
    private double desvioPadrao;

    @JsonProperty("CoeficienteVariacao")
    private double coeficienteVariacao;

    @JsonProperty("Minimo")
    private double minimo;

    @JsonProperty("Maximo")
    private double maximo;

    @JsonProperty("numeroRespondentes")
    private int numeroRespondentes;

    @JsonProperty("baseCalculo")
    private int baseCalculo;

    @JsonProperty("Indicador")
    public String getIndicador() {
        return indicador;
    }

    @JsonProperty("Data")
    public String getData() {
        return data;
    }

    @JsonProperty("DataReferencia")
    public String getDataReferencia() {
        return dataReferencia;
    }

    @JsonProperty("Media")
    public double getMedia() {
        return media;
    }

    @JsonProperty("Mediana")
    public double getMediana() {
        return mediana;
    }

    @JsonProperty("DesvioPadrao")
    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    @JsonProperty("CoeficienteVariacao")
    public double getCoeficienteVariacao() {
        return coeficienteVariacao;
    }

    @JsonProperty("Minimo")
    public double getMinimo() {
        return minimo;
    }

    @JsonProperty("Maximo")
    public double getMaximo() {
        return maximo;
    }

    @JsonProperty("numeroRespondentes")
    public int getNumeroRespondentes() {
        return numeroRespondentes;
    }

    @JsonProperty("baseCalculo")
    public int getBaseCalculo() {
        return baseCalculo;
    }

    @Override
    public String toString() {
        return "dadosolinda {" + " indicador : " + indicador + ", data : " + data + ", dataReferencia : "
                + dataReferencia + ", media : " + media + ", mediana : " + mediana + ", desvioPadrao : " + desvioPadrao
                + ", coeficienteVariacao : " + coeficienteVariacao + ", minimo : " + minimo + ", maximo : " + maximo
                + ", numeroRespondentes : " + numeroRespondentes + ", baseCalculo : " + baseCalculo + "}";
    }
}
