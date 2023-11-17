package com.demo.mvc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.demo.mvc.beans.OrderHistory;

@Repository
public interface HistoryRepo extends JpaRepository<OrderHistory, Long>{

	
	@Query(value = "select * from o_history where customer_b_id=? ORDER BY h_id DESC", nativeQuery = true)
	public List<OrderHistory> getAllHistory(long id);
}
