package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Connection;
import com.example.Service.ConnectionService;




@RestController
@RequestMapping("/connection")
public class ConnectionController {

	@Autowired
	ConnectionService conService;
	
	@PostMapping("/save")
	public Connection saveConnection(@RequestBody Connection con) {
		Connection connection = conService.saveConnection(con);
		return connection;
	}
	
	@GetMapping("/get/{connection_id}")
	public ResponseEntity<Connection> getById(@PathVariable("connection_id") String connection_id) {
		Connection connection = conService.getById(connection_id);
		return ResponseEntity.ok(connection);
	}
	
	@PutMapping("/update/{connection_id}")
	public Connection updateConnection(@PathVariable("connection_id") String connection_id,@RequestBody Connection con) {
		return conService.updateConnection(connection_id, con);
	}
	
	
}
