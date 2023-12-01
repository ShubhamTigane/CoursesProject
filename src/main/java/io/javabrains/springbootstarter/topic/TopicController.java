package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topic")
	public List<Topic> getAllTopic()
	{
		return Arrays.asList(
				new Topic(1, "Java"),
				new Topic (2,"Javascript"),
				new Topic(3,"CSharp")
				);
				
	}
}
