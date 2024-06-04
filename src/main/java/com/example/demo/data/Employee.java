package com.example.demo.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EMP_DET")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  name;
    private String dateOfJoining;
    private String location;
    private Integer age;
    private String gender;
    @ElementCollection(targetClass = Address.class)
    private List<Address> addressList;
   /* @ElementCollection(targetClass = Contacts.class)
    private List<Contacts> contacts;*/



}
