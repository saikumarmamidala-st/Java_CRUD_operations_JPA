package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  public Candidate saveCandidate(Candidate candidate);
  public List<Candidate> saveCandidates(List<Candidate> candidates);
  public List<Candidate> getCandidates();
  public Candidate getCandidateById(int candidateId);
  public String deleteCandidate(int candidateId);
  public Candidate updateCandidate(Candidate candidate);
//public void addCandidate(Candidate candidate);
 

}
