package com.pragma.scheduleassessment.handler;

import com.pragma.scheduleassessment.dto.SchedulingRequest;
import com.pragma.scheduleassessment.dto.SchedulingResponse;
import com.pragma.scheduleassessment.service.ChapterCalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@RequiredArgsConstructor
@Component("ChapterCalendarHandler")
public class ChapterCalendarHandler implements Function<SchedulingRequest, SchedulingResponse> {

    private final ChapterCalendarService chapterCalendarService;

    @Override
    public SchedulingResponse apply(SchedulingRequest schedulingRequest) {
        return chapterCalendarService.scheduleAssessment(schedulingRequest);
    }

}