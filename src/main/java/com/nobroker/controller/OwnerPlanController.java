package com.nobroker.controller;

import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.service.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPlan")
public class OwnerPlanController {

    @Autowired
    private OwnerPlanService ownerPlanService;

    @PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){
        OwnerPlanDto ownerPlans = ownerPlanService.createOwnerPlans(ownerPlanDto);
        return new ResponseEntity<>(ownerPlans, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OwnerPlanDto>> getAllOwnerPlans(){
        List<OwnerPlanDto> dto = ownerPlanService.getAllOwnerPlans();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
