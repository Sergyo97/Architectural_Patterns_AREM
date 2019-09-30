package edu.eci.arem.persistence.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.eci.arem.model.User;
import edu.eci.arem.persistence.UserPersistence;

/**
 * InMemoryUserPersistence
 */
@Component
public class UserImpl implements UserPersistence {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<User> findAll() throws SQLException {
        String query = "SELECT Name FROM USER;";
        List<User> auctions = new ArrayList<User>();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setName(rs.getString("Name"));
                auctions.add(user);
            }
            connection.close();
            return auctions;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}