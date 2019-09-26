package edu.eci.arem.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	IAuctionRepository auctionRepository;
	
	@RequestMapping(value="/test1",method = RequestMethod.GET)
	public ResponseEntity<?> listAllUsers(){
	    try {
	        return new ResponseEntity<>(auctionRepository.findAll(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("mal",HttpStatus.NOT_FOUND);
	    }
    }
}