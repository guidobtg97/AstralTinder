package com.astralTinderV1.repositories;

import com.astralTinderV1.enttities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoteRepository extends JpaRepository<Vote,String> {
    
}