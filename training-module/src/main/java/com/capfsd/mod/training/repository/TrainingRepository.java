package com.capfsd.mod.training.repository;

import com.capfsd.mod.training.entity.Training;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {

    Page<Training> findAllByStatusIn(Pageable pageable, String... statuses);

}
