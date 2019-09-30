package edu.eci.arem.persistence;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.arem.model.User;

/**
 * UserPersistence
 */
@Service
public interface UserPersistence {

    public List<User> findAll() throws SQLException;

}