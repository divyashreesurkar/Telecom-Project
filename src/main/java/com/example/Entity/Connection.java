package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Connection {

	@Id
	private String connection_id;
	private String connection_name;
	private String connection_status;
	private String connection_plan;
	private Long connection_reference_no;
	public Connection() {
		super();
	}
	public Connection(String connection_id, String connection_name, String connection_status, String connection_plan,
			Long connection_reference_no) {
		super();
		this.connection_id = connection_id;
		this.connection_name = connection_name;
		this.connection_status = connection_status;
		this.connection_plan = connection_plan;
		this.connection_reference_no = connection_reference_no;
	}
	public String getConnection_id() {
		return connection_id;
	}
	public void setConnection_id(String connection_id) {
		this.connection_id = connection_id;
	}
	public String getConnection_name() {
		return connection_name;
	}
	public void setConnection_name(String connection_name) {
		this.connection_name = connection_name;
	}
	public String getConnection_status() {
		return connection_status;
	}
	public void setConnection_status(String connection_status) {
		this.connection_status = connection_status;
	}
	public String getConnection_plan() {
		return connection_plan;
	}
	public void setConnection_plan(String connection_plan) {
		this.connection_plan = connection_plan;
	}
	public Long getConnection_reference_no() {
		return connection_reference_no;
	}
	public void setConnection_reference_no(Long connection_reference_no) {
		this.connection_reference_no = connection_reference_no;
	}
	@Override
	public String toString() {
		return "Connection [connection_id=" + connection_id + ", connection_name=" + connection_name
				+ ", connection_status=" + connection_status + ", connection_plan=" + connection_plan
				+ ", connection_reference_no=" + connection_reference_no + "]";
	}
	
	
	
	
}
