package com.ost.Ktob.service;

import com.ost.Ktob.model.Kteb;
import com.ost.Ktob.repository.KtebRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class KtebServiceImp implements KtebService{

    private final KtebRepository ktebRepository;

    public KtebServiceImp(KtebRepository ktebRepository){
        this.ktebRepository = ktebRepository;
    }

    @Override
    public Kteb saveKteb(Kteb kteb)
    {
        kteb.setCreate_date(LocalDateTime.now());
        return ktebRepository.save(kteb);
    }

    @Override
    public void deleteKteb(Long id)
    {
        ktebRepository.deleteById(id);
    }

    @Override
    public List<Kteb> findKtob(){
        return ktebRepository.findAll();
    }
}
