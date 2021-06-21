package resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import resttemplate.dao.Dao;
import resttemplate.model.Model1;
import resttemplate.model.Model2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TemplateApplication.class);
        Dao dao = context.getBean(Dao.class);

        List<Model1> reqList = new ArrayList<>();
        reqList.add(new Model1("2"));
        reqList.add(new Model1("4"));

        Map<Model1, Model2> respMap = dao.getModel2(reqList);
        respMap.entrySet().forEach(System.out::println);
    }
}
