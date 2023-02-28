package com.CameraApplication.AbuthairCameraApplication.Model;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiErrors {
    LocalDateTime localDateTime;
    HttpStatus httpStatus;
    int statusCode;
    String error;
    List<String> message;
}
