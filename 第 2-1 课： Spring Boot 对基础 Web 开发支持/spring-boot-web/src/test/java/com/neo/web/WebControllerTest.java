package com.neo.web;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class WebControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getUser() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.post("/getUser"));
        resultActions.andReturn().getResponse().setCharacterEncoding("UTF-8");
        String responseString = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("result : "+responseString);
        System.out.println("小明1\n");
    }

    @Test
    public void getUsers() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.post("/getUsers"));
        resultActions.andReturn().getResponse().setCharacterEncoding("UTF-8");
        String responseString = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("result : "+responseString);
        System.out.println("小明2\n");
    }


    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("name","")
                .param("age","666")
                .param("pass","test")
        );
    }


}
