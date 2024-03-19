package net.codejava.service.service;

import net.codejava.entity.Candidate;

public interface CandidateService {
    Candidate save(Candidate candidate);
        Candidate findCandidateById(Long id);
    Candidate update(Candidate candidate);
    Boolean delete(Candidate candidate);

}
