package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Connection;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, String> {

}
