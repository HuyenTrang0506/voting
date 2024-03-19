package net.codejava.service;

import net.codejava.entity.Candidate;
import net.codejava.repository.CandidateRepository;
import net.codejava.service.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    @Override
    public Candidate save(Candidate candidate) {
        return null;
    }

    @Override
    public Candidate findCandidateById(Long id) {
        return null;
    }

    @Override
    public Candidate update(Candidate candidate) {
        return null;
    }

    @Override
    public Boolean delete(Candidate candidate) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
