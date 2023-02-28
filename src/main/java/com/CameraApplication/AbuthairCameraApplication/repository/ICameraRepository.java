package com.CameraApplication.AbuthairCameraApplication.repository;

import com.CameraApplication.AbuthairCameraApplication.Model.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICameraRepository  extends JpaRepository<Camera,Integer> {


    @Query("from Camera c where brand =?1 and c.price <=?2")
    List<Camera> findByBrandAndPrice(String brand, double price);
    List<Camera> findByLensType(String lensType);



    List<Camera> findByCameraType(String cameraType);


}
