package com.capfsd.mod.technology.repository;

import com.capfsd.mod.technology.entity.Technology;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {

    Page<Technology> findAllByNameContainsIgnoreCase(String name, Pageable pageable);
    Page<Technology> findAllByNameContainsIgnoreCaseAndIdIn(String name, Set<Long> ids, Pageable pageable);

}
