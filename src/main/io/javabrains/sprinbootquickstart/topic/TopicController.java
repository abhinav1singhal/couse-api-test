package io.javabrains.sprinbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopic(){
		
		return Arrays.asList(
				new Topic(1,"Srping1","Srping1 framework"),
				new Topic(2,"Srping2","Srping2 framework"),
				new Topic(3,"Srping3","Srping3 framework"),
				new Topic(4,"Srping4","Srping4 framework")
				);
		
	}
}
