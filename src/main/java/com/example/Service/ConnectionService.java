package com.example.Service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Connection;
import com.example.Repository.ConnectionRepository;




@Service
public class ConnectionService {

	@Autowired
	ConnectionRepository conRepository;
	
        public Connection saveConnection(Connection con) {
		con.setConnection_id(UUID.randomUUID().toString());
		return conRepository.save(con);
	}
	
        public Connection getById(String connection_id) {
    		Optional<Connection> con = conRepository.findById(connection_id);
    		if (con.isPresent()) {
    			return con.get();
    		}
    		return null;
    	}
	
}
