package edu.eci.arem.demo;

import java.sql.SQLException;
import java.util.*;


public interface IAuctionRepository {
    public List<Test> findAll() throws SQLException ;  
}