package com.example.demo.serviceImpl;

import com.example.demo.data.Employee;
import com.example.demo.respository.EmpRepo;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepo empRepo;
    @Override
    public void saveEmpDetails(Employee employee) {

      empRepo.save(employee);

    }
}
