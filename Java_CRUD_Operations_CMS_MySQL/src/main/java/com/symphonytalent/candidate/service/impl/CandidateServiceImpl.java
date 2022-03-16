package com.symphonytalent.candidate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symphonytalent.candidate.bean.Candidate;
import com.symphonytalent.candidate.repository.CandidateRepository;
import com.symphonytalent.candidate.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {
	@Autowired
	private CandidateRepository repo;
//  private static List<Candidate> candidates = new ArrayList<>();
//  static{
//    candidates.add(new Candidate(100, "ankur.agarwal@example.com", "Ankur", "Agarwal", "987654320"));
//    candidates.add(new Candidate(101, "alok.sharma@example.com", "Alok", "Sharma", "987654321"));
//    candidates.add(new Candidate(102, "farhan.qureshi@example.com", "Farhan", "Qureshi", "987654322"));
//    candidates.add(new Candidate(103, "raju.rastogi@example.com", "Raju", "Rastogi", "987654323"));
//    candidates.add(new Candidate(104, "chatur.ramalingam@example.com", "Chatur", "Ramalingam", "987654324"));
//    candidates.add(new Candidate(105, "rancho@example.com ", "Ranchhoddas Shamaldas", "Chanchad", "987654325"));
//  }
	
  @Override
	public Candidate saveCandidate(Candidate candidate)
	{
		return repo.save(candidate);
	}
  public List<Candidate> saveCandidates(List<Candidate> candidates) {
    return repo.saveAll(candidates);
  }
  @Override
  public List<Candidate> getCandidates(){
	  return repo.findAll();
  }
  @Override
  public Candidate getCandidateById(int candidateId){
	   return repo.findById(candidateId).orElse(null);
  }
  @Override
  public String deleteCandidate(int candidateId) {
	  repo.deleteById(candidateId);
	  return "Candidate remioved"+candidateId;
  }
  @Override
  public Candidate updateCandidate(Candidate candidate) {
	  Candidate existingCandidate=repo.findById(candidate.getCandidateId()).orElse(null);
	  existingCandidate.setCandidateId(candidate.getCandidateId());
	  existingCandidate.setEmail(candidate.getEmail());
	  existingCandidate.setFirstName(candidate.getFirstName());
	  existingCandidate.setLastName(candidate.getLastName());
	  existingCandidate.setPhone(candidate.getPhone());
	  return repo.save(existingCandidate);
	  
  }

  }
