package edu.eci.arem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arem.persistence.UserPersistence;

/**
 * UserController
 */
@RestController
public class UserController {

    @Autowired
    UserPersistence userPersistence;

    @RequestMapping(value="/name",method = RequestMethod.GET)
	public ResponseEntity<?> listAllUsers(){
	    try {
	        return new ResponseEntity<>(userPersistence.findAll(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Error finding users...",HttpStatus.NOT_FOUND);
	    }
    }
}