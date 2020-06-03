package com.tanknavy.sb.thymeleaf;

import com.tanknavy.sb.thymeleaf.controller.EmployeeController;
import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// SpringRunner is an alias for the SpringJUnit4ClassRunner.
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
// 用于mvc components层，如果需要全部功能，使用@SpringBootTest 和@AutoConfigureMockMvc
//@WebMvcTest(EmployeeController.class) //focuses only on Spring MVC components.
@SpringBootTest
@AutoConfigureMockMvc //auto-configuration of MockMvc
class ThymeleafApplicationTests {

	@Autowired
	private MockMvc mockMvc;
//	@Autowired
//	private EmployeeController employeeController;

//	@Before
//	public void setUp() throws Exception{
//		//MockitoAnnotations.initMocks(this);
//		mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
//		//mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//	}

	@Test
	void contextLoads() {
	}

	@Test
	public void employeeControllerTest() throws Exception {
		//this.mockMvc.perform(MockMvcRequestBuilders.get("/employees/list")
		mockMvc.perform(MockMvcRequestBuilders.get("/employees/list")
		//this.mockMvc.perform(MockMvcRequestBuilders.post("/employees/list", user)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType("text/html;charset=UTF-8"))
				//.andExpect(content().contentType("application/json;charset=UTF-8"))
				//.andExpect(jsonPath("$.msg").value("Input is not compliance"))
				//.andExpect(model().attributeHasErrors("person"))
				//.andDo(MockMvcResultHandlers.print()) //print MockHttpServletResponse
		;
	}

}
