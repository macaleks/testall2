package resttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import resttemplate.dao.Dao;
import resttemplate.model.Model1;
import resttemplate.model.Model2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    Dao dao;

    @GetMapping("test")
    public String test() {
        return "testing";
    }

    @GetMapping("byId")
    public Model2 getModel1(@RequestParam(value = "id") String id) {
        Model1 model1 = new Model1(id);
        return dao.getModel2(Arrays.asList(model1)).get(model1);
    }

    /**
     * Example: [{"id":"3"},{"id":"4"}]
     * @return
     */
    @GetMapping("defaultlist")
    public List<Model1> getModel1List() {
        Model1 model1_1 = new Model1("3");
        Model1 model1_2 = new Model1("4");
        return Arrays.asList(model1_1, model1_2);
    }

    /**
     * http://localhost:8080/map?model1s=[{%22id%22:%223%22},{%22id%22:%224%22}]
     * @param model1s
     * @return
     */
    @GetMapping("map")
    public Map<Model1, Model2> getMap(Model1[] model1s) {
        return dao.getModel2(Arrays.asList(model1s));
    }

    @GetMapping("object")
    public Map<Model1, Model2> getMap(Model1 model) {
        return dao.getModel2(Arrays.asList(model));
    }
}
