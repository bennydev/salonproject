package com.example.salonapi.services;

import com.example.salonapi.repository.SalonServiceDetail;
import com.example.salonapi.repository.SalonServiceDetailDAO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "http://localhost:3000")
public class SalonServiceController {

  private SalonServiceDetailDAO salonServiceDetailDAO;

  public SalonServiceController(SalonServiceDetailDAO salonServiceDetailDAO) {
    this.salonServiceDetailDAO = salonServiceDetailDAO;
  }

  @GetMapping("/retrieveAvailableSalonServices")
  @ApiOperation(value = "RetrieveAvailableSalonServicesAPI")
  public List<SalonServiceDetail> retrieveAvailableSalonServicesAPI() {

    return salonServiceDetailDAO.findAll();
  }

}
