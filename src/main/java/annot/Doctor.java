package annot;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Doctor {

    @InjectList({Table.class, Water.class})
    List<Measure> measures;

    void listMeasures() {
        measures.forEach(measure -> System.out.println(measure.getClass().getSimpleName()));
    }
}
