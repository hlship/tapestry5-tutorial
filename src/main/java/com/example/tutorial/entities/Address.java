package com.example.tutorial.entities;

import com.example.tutorial.data.Honorific;
import org.apache.tapestry5.beaneditor.Validate;

public class Address
{
    public Honorific honorific;

    @Validate("required")
    public String firstName;

    @Validate("required")
    public String lastName;

    @Validate("required")
    public String street1;
    public String street2;

    @Validate("required")
    public String city;

    @Validate("required")
    public String state;

    @Validate("required,regexp")
    public String zip;

    public String email;

    public String phone;
}