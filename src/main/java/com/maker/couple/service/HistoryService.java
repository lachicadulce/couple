package com.maker.couple.service;

import com.maker.couple.domain.History;
import com.maker.couple.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class HistoryService {

    @Autowired
    HistoryRepository historyRepository;

    public List<History> findAll(){
        return historyRepository.findAll();
    }

    public History findById(int id){
        return historyRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public History save(History history) {
        return historyRepository.save(history);
    }

    public void delete(int id){
        historyRepository.deleteById(id);
    }
}
