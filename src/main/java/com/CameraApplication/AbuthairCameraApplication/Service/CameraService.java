package com.CameraApplication.AbuthairCameraApplication.Service;

import com.CameraApplication.AbuthairCameraApplication.Exception.CameraNotFoundException;
import com.CameraApplication.AbuthairCameraApplication.Model.Camera;
import com.CameraApplication.AbuthairCameraApplication.repository.ICameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraService implements ICameraService  {
@Autowired
private ICameraRepository iCameraRepository;


    @Override
    public void addCamera(Camera camera) {
        iCameraRepository.save(camera);
    }

    @Override
    public void updateCamera(Camera camera) {
     iCameraRepository.save(camera);
    }

    @Override
    public void deleteCamera(int cameraId) {
        iCameraRepository.deleteById(cameraId);
    }

    @Override
    public Camera getById(int cameraId) throws CameraNotFoundException {

       Camera camera = iCameraRepository.findById(cameraId).get();
       if(camera == null){
           throw new CameraNotFoundException("Camera Id Not found"+cameraId);
       }
         return camera;
    }

    @Override
    public List<Camera> getAll() {
        return iCameraRepository.findAll();
    }

    @Override
    public List<Camera> getByBrandAndPrice(String brand, double price) {
        List<Camera> cameras = iCameraRepository.findByBrandAndPrice(brand,price);
        if(cameras.isEmpty()){
            throw new CameraNotFoundException("Camera not found with "+brand+" price ₹ "+price);
        }
        return cameras;
    }

    @Override
    public List<Camera> getByLensType(String lensType) {
        List<Camera> cameras = iCameraRepository.findByLensType(lensType);
        if(cameras.isEmpty()){
            throw new CameraNotFoundException("Camera is not found with Lens Type "+lensType);
        }
        return cameras;
    }

    @Override
    public List<Camera> getByCameraType(String cameraType) {
       List<Camera> cameras = iCameraRepository.findByCameraType(cameraType);
       if(cameras.isEmpty()){
           throw new CameraNotFoundException("Camera not found with that type  "+cameraType);
       }
       return cameras;
    }
}
