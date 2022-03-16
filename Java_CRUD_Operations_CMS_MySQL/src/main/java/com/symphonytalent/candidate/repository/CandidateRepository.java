package com.symphonytalent.candidate.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer>{



}
