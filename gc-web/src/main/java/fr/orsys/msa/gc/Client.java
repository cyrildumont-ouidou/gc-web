package fr.orsys.msa.gc;


import lombok.Data;


@Data

public class Client {

    public Integer id;
    public String lastname;
    public String firstname;
    public String address;
    public String city;
    public String zipCode;

}
