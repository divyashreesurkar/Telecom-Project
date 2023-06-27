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
        
        
        public Connection updateConnection(String connection_id, Connection newEntity) {
    		Connection availableEntity = conRepository.findById(connection_id).get();// 1 chetana 10000

    		if (availableEntity != null) {
    			if (newEntity.getConnection_name() != null) {
    				availableEntity.setConnection_name(newEntity.getConnection_name()); // chetana ---> Raj
    			}
    			if (newEntity.getConnection_plan() != null) {
    				availableEntity.setConnection_plan(newEntity.getConnection_plan()); // 10000 ---->15000
    			}
    			if (newEntity.getConnection_status() != null) {
    				availableEntity.setConnection_status(newEntity.getConnection_status()); // 10000 ---->15000
    			}
    			if (newEntity.getConnection_reference_no() > 0) {
    				availableEntity.setConnection_reference_no(newEntity.getConnection_reference_no());; // 10000 ---->15000
    			}
    			return conRepository.save(availableEntity);
    		} else {
    			return null;
    		}

    	}
	
}
