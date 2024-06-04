package com.example.demo.controller;


import com.example.demo.data.Employee;
import com.example.demo.exception.EmployeeDetailsEmptyException;
import com.example.demo.service.EmpService;
import com.example.demo.serviceImpl.EmpServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/rest/api")
@RequiredArgsConstructor
public class FinalTestController {
    @Autowired
    private EmpService empService;

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertEmpDetails(@RequestBody Employee employee){

        if(!ObjectUtils.isEmpty(employee))
            throw new EmployeeDetailsEmptyException("Employee details are empty: Please provide the required details");
        else
            empService.saveEmpDetails(employee);

        return "Insertion success!!";
    }





    }
