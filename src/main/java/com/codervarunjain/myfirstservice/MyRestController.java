package com.codervarunjain.myfirstservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class MyRestController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public JsonNode firstService() {
		ObjectNode node = new ObjectMapper().createObjectNode();
		node.put("field", "hello");
		return node;
	}

}
