package com.springsession.board5.repository;

import com.springsession.board5.entity.Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Crud,Integer> {
}
