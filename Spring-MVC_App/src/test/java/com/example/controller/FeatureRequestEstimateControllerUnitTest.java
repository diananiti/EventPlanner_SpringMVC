package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(FeatureRequestEstimateController.class)
public class FeatureRequestEstimateControllerUnitTest {

	@Autowired
	private MockMvc mockMvc;
	
	
	@InjectMocks
	private FeatureRequestEstimateController featureRequestEstimateController;
	
	@Before 
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetForm() throws Exception{
		//simularea afisarii(getting) formularului pentru utilizator pentru a completa campurile
		mockMvc
			.perform(get("/confirmareTrimitere"))
			.andExpect(status().is(200))
			.andReturn();
	}
	
	@Test
	public void testPostForm() throws Exception {
//		//sendFormRequest aFormBean=new sendFormRequest(); //from domain
//		
//		//simularea submit a formularului prin POST
//		mockMvc
//		.perform(post("/confirmareTrimitere",aFormBean))
//		.andExpect(status().isOk())
//		.andReturrn();
	}
	
}
