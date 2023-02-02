package com.pragma.scheduleassessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchedulingRequest {

    private Long chapterId;
    private String specialty;
    private String email;

}