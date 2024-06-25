package com.flowired_ai.controller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chats")
public class ChatController {


	private final OpenAiChatModel aiChatModel;
	
	public ChatController(OpenAiChatModel aiChatModel ) {
		this.aiChatModel = aiChatModel;
	}
	
	@GetMapping
	public String chat(@RequestParam String text) {
		return aiChatModel.call(text);
	}

}
