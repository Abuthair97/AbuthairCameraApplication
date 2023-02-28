package com.CameraApplication.AbuthairCameraApplication.Exception;


public class CameraNotFoundException extends RuntimeException  {
    public CameraNotFoundException() {
    }

    public CameraNotFoundException(String message) {
        super(message);
    }
}