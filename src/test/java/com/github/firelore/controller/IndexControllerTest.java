package com.github.firelore.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class IndexControllerTest {
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders
					.standaloneSetup(new IndexController())
					.build();
	}
	
	@Test
	public void indexPageAppearsOnRoot() throws Exception {
		mockMvc.perform(get("/"))
			.andExpect(view().name("index"));
	}
}
