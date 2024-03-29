package com.capfsd.mod.training.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class TrainingVo {
    private Float commissionAmount;
    private Integer rating;
    private Float avgRating = 0.0f;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String endDate;
    @JsonFormat(pattern = "HH:mm:ss")
    private String startTime;
    @JsonFormat(pattern = "HH:mm:ss")
    private String endTime;
    private Float amountReceived;
    private Long userId;
    private Long mentorId;
    private Long skillId;
}
