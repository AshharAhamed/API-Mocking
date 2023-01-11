package com.mockApi.mockApiApp.Repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.mockApi.mockApiApp.Entity.Api;

public interface ApiRepository extends /*CrudRepository*/JpaRepository<Api, Integer> {
	List<Api> findByUrl(String url/* , Pageable pageable */);
}
