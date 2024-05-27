package com.bookingservice.models.dtos;

import com.bookingservice.models.entities.enums.BookStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class RequestStatusDto {
    private BookStatus status;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate start_date;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate end_date;
}
