package resttemplate.model;

import java.util.Objects;

public class Model1 {
    private String id;

    public Model1() {
    }

    public Model1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model1 model1 = (Model1) o;
        return Objects.equals(id, model1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Model1{" +
                "id='" + id + '\'' +
                '}';
    }
}
