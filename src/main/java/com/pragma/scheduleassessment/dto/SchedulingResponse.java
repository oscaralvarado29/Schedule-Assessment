package com.pragma.scheduleassessment.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SchedulingResponse {

    private String summary;
    private String description;
    private EventDate originalStartTime;
    private List<AttendeToSend> attendees;


}