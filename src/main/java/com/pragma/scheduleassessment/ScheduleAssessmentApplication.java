package com.pragma.scheduleassessment;

import com.pragma.scheduleassessment.handler.ChapterCalendarHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@RequiredArgsConstructor
@EnableFeignClients
@SpringBootApplication
public class ScheduleAssessmentApplication {

	private final ChapterCalendarHandler chapterCalendarHandler;

	@Bean
	public Function<String, String> myExampleFunction() {
		//return chapterCalendarHandler.apply();
		return null;
	}

	public static void main(String[] args) {
		SpringApplication.run(ScheduleAssessmentApplication.class, args);
	}

}