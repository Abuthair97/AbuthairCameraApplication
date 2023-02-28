package com.CameraApplication.AbuthairCameraApplication.Service;

import com.CameraApplication.AbuthairCameraApplication.Exception.CameraNotFoundException;
import com.CameraApplication.AbuthairCameraApplication.Model.Camera;

import java.util.List;

public interface ICameraService {

    void addCamera(Camera camera);
    void updateCamera(Camera camera);
    void deleteCamera(int cameraId);

    Camera getById(int cameraId) throws CameraNotFoundException;

    List<Camera> getAll();

    List<Camera> getByBrandAndPrice(String brand, double price);
    List<Camera> getByLensType(String lensType);

    List<Camera> getByCameraType(String cameraType);

}
