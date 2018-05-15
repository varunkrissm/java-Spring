package com.mytest;

import static java.util.Collections.singletonList;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.mytest.controller.UploadController;
import com.mytest.model.UploadDetails;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UploadController.class)
public class UploadControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UploadController uploadController;

	@Test
	@Ignore
	public void retrieveDetailsForCourse() throws Exception {

		UploadDetails upload = new UploadDetails();
		upload.setEmail("john@gmail.com");
		upload.setId(101);

		List<UploadDetails> uploadDetails = singletonList(upload);

		given(uploadController.uploadDetails()).willReturn((ResponseEntity<List<UploadDetails>>) uploadDetails);

		mockMvc.perform(get("/list")
				.contentType(APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].email", is(upload.getEmail())));

	}

}