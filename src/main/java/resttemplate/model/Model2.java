package resttemplate.model;

import java.util.Objects;

public class Model2 {
    private String responseId;
    private String name;

    public Model2(String responseId, String name) {
        this.responseId = responseId;
        this.name = name;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model2 model2 = (Model2) o;
        return Objects.equals(responseId, model2.responseId) && Objects.equals(name, model2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseId, name);
    }

    @Override
    public String toString() {
        return "Model2{" +
                "responseId='" + responseId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
