package com.MicroMovies.userservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.MicroMovies.userservice.model.Notification;
import com.MicroMovies.userservice.repository.NotificationRepository;

@Component
public class KafkaListeners {
	
	@Autowired
	private NotificationRepository notificationRepository;
	
	@KafkaListener(
			topics="Notification",
			groupId= "groupId"
			)
	void listener(String data) {
		System.out.println("Listner received: " + data);
		String[] s=data.split("z33");
		System.out.println(s[0]+" "+s[1]+' '+s[2]);
		Boolean b=s[1].equals("true")?true:false;
		List<String> categories=new ArrayList<>();
		Collections.addAll(categories,s);
		categories.remove(0);
		categories.remove(1);
		Notification notification=new Notification();
		notification.setCategories(categories);
		notification.setAllusers(b);
		notification.setDescription(s[0]);
		
		notificationRepository.save(notification);
		
		
	}
	
	
}