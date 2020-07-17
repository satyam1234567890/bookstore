package com.cg.main;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookStoreApplicationTests {

	@Test
	void contextLoads() {
	}

}
/*
MediaType contentType = null;
mockMvc.perform((RequestBuilder) ((ResultActions) get("/listAllBooks").contentType(contentType))
.andExpect(status().isInternalServerError())
.andExpect(content().string("Books are not available"))
.andDo(print()));
*/