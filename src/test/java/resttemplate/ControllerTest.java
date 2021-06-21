package resttemplate;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import resttemplate.controller.Controller;
import resttemplate.dao.Dao;
import resttemplate.model.Model1;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
@WebMvcTest({Controller.class, Dao.class})
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {
        List<Model1> reqList = new ArrayList<>();
        reqList.add(new Model1("2"));
        reqList.add(new Model1("4"));
        Gson gson = new Gson();
        String json = gson.toJson(new Model1("2"));


        MockHttpServletResponse response = mockMvc.perform(
                MockMvcRequestBuilders.get("/object")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
//        ).andExpect(status().isOk()).andReturn();
        ).andReturn().getResponse();


    }
}
