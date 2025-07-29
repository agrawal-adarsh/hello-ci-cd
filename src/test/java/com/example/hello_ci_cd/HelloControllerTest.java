package com.example.hello_ci_cd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



import com.example.hellocicd.HelloController;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloEndPointReturnMessage(){
        try {
            mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello CI/CD 🚀"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
