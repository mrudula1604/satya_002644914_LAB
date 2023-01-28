/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author prasad
 */
public class address {
    String street_Name;
    String apt_no;
    String city;
    String zip_code;
    
    public address(){
        this.street_Name = "";
        this.apt_no = "";
        this.city = "";
        this.zip_code = "";
    }

    public String getStreet_Name() {
        return street_Name;
    }

    public void setStreet_Name(String street_Name) {
        this.street_Name = street_Name;
    }

    public String getApt_no() {
        return apt_no;
    }

    public void setApt_no(String apt_no) {
        this.apt_no = apt_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    

    
    
}
