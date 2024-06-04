package com.example.demo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Contacts {
    @ElementCollection(targetClass = EmailSet.class)
    private List<EmailSet> emails;
    @ElementCollection(targetClass = PhoneNumbersSet.class)
    private List<PhoneNumbersSet> phoneNumbers;
    private String typeOfContact;

}
