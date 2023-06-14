package com.MicroMovies.userservice.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MicroMovies.userservice.model.Notification;
import com.MicroMovies.userservice.repository.NotificationRepository;
import com.MicroMovies.userservice.repository.UserRepository;

@RestController
public class NotificationController {
	
	@Autowired
	private NotificationRepository notificationRepository;
	@Autowired
	private UserRepository userRepository;
	
	public UserController userController=new UserController(userRepository);
	
	@GetMapping("/notifications")
	public ResponseEntity<List<Notification>> getNotifications(){
		List<Notification> notificattions=notificationRepository.findAll();
		return ResponseEntity.ok(notificattions);
		}
	
	@PostMapping("/notif")
	public ResponseEntity<Notification> addNotification(@RequestBody Notification notification){
		
		notificationRepository.save(notification);
		
		return ResponseEntity.status(201).body(notification);
		
	}
	
	@GetMapping("/usernotifications")
	public ResponseEntity<List<Notification>> GetuserNotifications(@RequestParam String id){
		List<Notification> notificattions=notificationRepository.findAll();
		Set<Notification> set=new LinkedHashSet<>();
		for(int i=0;i<notificattions.size();i++) {
			if(notificattions.get(i).getAllusers()) {
				set.add(notificattions.get(i));
			}
			else {
				for(int j=0 ; j<userRepository.findById(id).get().getPreferences().size();j++ ) {
					if(notificattions.get(i).getCategories().contains(userRepository.findById(id).get().getPreferences().get(j))) {
						
					 set.add(notificattions.get(i));
					 break;
					 }
				}
			}
		}
		
		return ResponseEntity.ok(new ArrayList<>(set));	
		
	}
	
	

}
