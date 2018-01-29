package com.medha.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.medha.model.User;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setFirstName(rs.getString("firstName"));
		user.setMiddleName(rs.getString("middleName"));
		user.setLastName(rs.getString("lastName"));
		user.setCity(rs.getString("city"));
		user.setId(rs.getInt("id"));
		return user;
	}

}
