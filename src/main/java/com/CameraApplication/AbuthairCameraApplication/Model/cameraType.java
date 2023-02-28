package com.CameraApplication.AbuthairCameraApplication.Model;

public enum cameraType {
    DSLR("DSLR Camera"),
    SLR("SLR Camera"),
    MIRRORLESS("Mirror Less Camera"),
    POINTSHOOT("Point & Shoot Camera");

    private   String type;

    cameraType(String type) {
        this.type = type;
    }
}
