package com.symphonytalent.candidate.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.symphonytalent.candidate.bean.Candidate;
import com.symphonytalent.candidate.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @Autowired
  private CandidateService candidateService;


  @PostMapping(value = "/add")
  
	public Candidate addCandidate(@RequestBody Candidate candidate) {
		return candidateService.saveCandidate(candidate);
	}
  @PostMapping(value = "/addCandidates")
  
	public List<Candidate> addCandidates(@RequestBody List<Candidate> candidates) {
		return candidateService.saveCandidates(candidates);
	}
  @GetMapping(value = "/getAll")
  public List<Candidate> getAllCandidates() {

    return candidateService.getCandidates();
  }
  
  
 @GetMapping(value = "/get/{candidateId}")
  public Candidate getCandidateById(@PathVariable("candidateId") Integer candidateId)
{
	 
return candidateService.getCandidateById(candidateId);

}  
 
 @PutMapping(value = "/update/{candidateId}")
 public Candidate updateCandidate(@RequestBody Candidate candidate,@PathVariable("candidateId") Integer candidateId){
	return candidateService.updateCandidate(candidate);
	
 }
 @DeleteMapping(value = "/delete/{candidateId}")
 public String deleteCandidate(@PathVariable("candidateId") Integer candidateId) {
	return candidateService.deleteCandidate(candidateId);
 
	 
	    
 }

 
}