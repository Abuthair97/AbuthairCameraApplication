package com.CameraApplication.AbuthairCameraApplication.Controller;

import com.CameraApplication.AbuthairCameraApplication.Exception.CameraNotFoundException;
import com.CameraApplication.AbuthairCameraApplication.Model.Camera;
import com.CameraApplication.AbuthairCameraApplication.Service.ICameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camera-api/")
//http://localhost:8081/camera-api/cameras
public class CameraController {
    @Autowired
private ICameraService iCameraService ;


    @PostMapping("/cameras")
    ResponseEntity<Void> addCamera(@RequestBody  Camera camera){
     iCameraService.addCamera(camera);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","Camera has been added");
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
    }
    @PutMapping("/cameras")
    ResponseEntity<Void> updateCamera(@RequestBody Camera camera){
    iCameraService.updateCamera(camera);
     HttpHeaders headers = new HttpHeaders();
     headers.add("desc","Camera has been updated");
     return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }

    @DeleteMapping("/cameras/cameraId/{cameraId}")
    ResponseEntity<Void> deleteCamera(@PathVariable("cameraId") int cameraId){
    iCameraService.deleteCamera(cameraId);
    HttpHeaders headers = new HttpHeaders();
    headers.add("desc","Camera Has been Deleted With "+cameraId);
    return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }
    @GetMapping("/cameras/cameraId/{cameraId}")
    ResponseEntity<Camera> getById(@PathVariable("cameraId") int cameraId) throws CameraNotFoundException{
    iCameraService.getById(cameraId);
    HttpHeaders headers =  new HttpHeaders();
    headers.add("desc","Camera found with "+cameraId);
    return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }
     @GetMapping("/cameras")
    ResponseEntity<List<Camera>> getAll() {
        iCameraService.getAll();
         HttpHeaders headers =  new HttpHeaders();
         headers.add("desc","Displaying All the Camera");
         return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }
 @GetMapping("/cameras/brand/{brand}/price/{price}")
   ResponseEntity<List<Camera>> getByBrandAndPrice(@PathVariable("brand") String brand,@PathVariable("price") double price) {
        iCameraService.getByBrandAndPrice(brand,price);
     HttpHeaders headers =  new HttpHeaders();
     headers.add("desc","Found brand "+brand+" and price"+price);
     return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();

    }
    @GetMapping("/cameras/lenstype/{lenstype}")
    ResponseEntity<List<Camera>> getByLensType(@PathVariable("lenstype") String lensType){
    iCameraService.getByLensType(lensType);
    HttpHeaders headers =  new HttpHeaders();
        headers.add("desc","List of camera with LensType  "+lensType);
        return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }
    @GetMapping("/cameras/cameratype/{cameraType}")
    ResponseEntity<List<Camera>> getByCameraType(@PathVariable("cameraType") String cameraType){
        iCameraService.getByCameraType(cameraType);
        HttpHeaders headers =  new HttpHeaders();
        headers.add("desc","List of camera with CameraType  "+cameraType);
        return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }

}
