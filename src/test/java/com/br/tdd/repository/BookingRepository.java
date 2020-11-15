package com.br.tdd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.tdd.model.BookingModel;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, String>{

	Optional<BookingModel> findByReserveName(String name);
	
}