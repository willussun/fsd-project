package com.capfsd.mod.training.service;

import com.capfsd.mod.training.dto.PageDto;
import com.capfsd.mod.training.dto.TrainingDto;
import com.capfsd.mod.training.entity.Training;
import com.capfsd.mod.training.vo.TrainingVo;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ITrainingService {

    void proposeTraining(TrainingVo trainingVo);
    void finalizeTraining(Long id);
    void completeTraining(Long id);
    void confirmTraining(Long id);
    void rejectTraining(Long id);
    Optional<TrainingDto> getTrainingById(Long id);
    PageDto<TrainingDto> getInprogressTrainings(Pageable pageable);
    PageDto<TrainingDto> getCompletedTrainings(Pageable pageable);
}
