package com.MicroMovies.userservice.repository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.MicroMovies.userservice.model.Notification;
import com.MicroMovies.userservice.model.User;

public interface NotificationRepository extends  MongoRepository<Notification, String>{


}
