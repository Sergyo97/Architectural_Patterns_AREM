package edu.eci.arem.demo;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TestService implements IAuctionServices{
	
	@Autowired
	private IAuctionRepository auctionRepository;
	
	@Override
	public List<Test> list() throws SQLException {
		return auctionRepository.findAll();
	}
}


