package com.maker.couple.repository;

import com.maker.couple.domain.IdealType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdealTypeRepository extends JpaRepository<IdealType, Integer> {
}
