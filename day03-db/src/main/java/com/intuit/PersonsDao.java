package com.intuit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsDao extends JpaRepository<Person, Integer> {

}
