package com.CameraApplication.AbuthairCameraApplication.Model;

public enum lensType {
ZOOM("Zoom Lens"),
    WIDE("Wide Angle Lens"),
    PRIME("Prime Lens"),
    TELEPHOTO("Telephoto Lens");

private String lensType;

    lensType(String lensType) {
        this.lensType = lensType;
    }
}
