package com.CameraApplication.AbuthairCameraApplication.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Camera {

    @Id
    @GeneratedValue(generator = "camera_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "camera_gen",sequenceName = "camera_sequence",initialValue = 1,allocationSize = 1)
    private Integer CameraId;
    @Column(length = 50)
    private String model;
    @Column(length = 50)
    private String cameraType;
    @Column(length = 50)
    private String lensType;

    private double price;
    @Column(length = 50)
    private String brand;

    public Camera(String model, String cameraType, String lensType, double price, String brand) {
        this.model = model;
        this.cameraType = cameraType;
        this.lensType = lensType;
        this.price = price;
        this.brand = brand;
    }


}
