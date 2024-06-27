package com.example.RESTful_API;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	
	ModelClass model;

	@GetMapping("{id}")
	public ModelClass dataDetails(String id)
	{
		return new ModelClass("1","vinoth","28");
	}
	
	@PostMapping
	public String createNewDetails(@RequestBody ModelClass model)
	{
		this.model=model;
		return "New API detail is successfully added";
	}
	
	@PutMapping
	public String updateAPIDetails(@RequestBody ModelClass model)
	{
		this.model=model;
		return "API details Updated successfully";
	}
	
	@DeleteMapping("{id}")
	public String deleteData(String id)
	{
		this.model=model;
		return "API details Deleted successfully";
		
	}
}
