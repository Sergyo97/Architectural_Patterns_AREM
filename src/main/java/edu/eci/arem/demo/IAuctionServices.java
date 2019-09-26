package edu.eci.arem.demo;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public interface IAuctionServices {

    public List<Test> list() throws SQLException;
	
}
