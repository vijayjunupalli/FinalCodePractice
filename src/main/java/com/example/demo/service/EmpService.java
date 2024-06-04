package com.example.demo.service;

import com.example.demo.data.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    void saveEmpDetails(Employee employee);
}
