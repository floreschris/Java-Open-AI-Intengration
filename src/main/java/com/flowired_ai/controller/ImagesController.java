package com.flowired_ai.controller;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class ImagesController {
	
	private final OpenAiImageModel imageModel;

	public ImagesController(OpenAiImageModel imageModel) {
		this.imageModel = imageModel;
	}
	
	@GetMapping
	public String getUrlImage(@RequestParam("text") String text) {
		return this.imageModel.call(new ImagePrompt(text)).getResult().getOutput().getUrl();
	}
	
	
	
	
	

}
