package com.maker.couple.service;

import com.maker.couple.domain.IdealType;
import com.maker.couple.repository.IdealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class IdealTypeService {

    @Autowired
    IdealTypeRepository idealTypeRepository;

    public List<IdealType> findAll(){
        return idealTypeRepository.findAll();
    }

    public IdealType findById(int id){
        return idealTypeRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public IdealType save(IdealType idealType) {
        return idealTypeRepository.save(idealType);
    }

    public void delete(int id){
        idealTypeRepository.deleteById(id);
    }
}
