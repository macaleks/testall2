package resttemplate.dao;

import org.springframework.stereotype.Repository;
import resttemplate.model.Model1;
import resttemplate.model.Model2;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class Dao {

    private Map<Model1, Model2> daoMap = new HashMap<>();

    @PostConstruct
    public void init() {
        daoMap.put(new Model1("1"), new Model2("100", "name100"));
        daoMap.put(new Model1("2"), new Model2("200", "name200"));
        daoMap.put(new Model1("3"), new Model2("300", "name300"));
        daoMap.put(new Model1("4"), new Model2("400", "name400"));
    }

    public Map<Model1, Model2> getModel2(List<Model1> model1) {
        return daoMap.entrySet().stream()
                .filter(e -> model1.contains(e.getKey()))
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
    }
}
