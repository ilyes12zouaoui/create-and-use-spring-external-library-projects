package tn.lass.simplerest.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@AutoConfigureMockMvc
@ExtendWith({SpringExtension.class})
@SpringBootTest
public class SimpleRestTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void multiple2() throws Exception {

        mvc.perform(
                post("/api/multiple?value=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("10"));

    }

    @Test
    void power2() throws Exception {

        mvc.perform(
                post("/api/power?value=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("25"));

    }
}
