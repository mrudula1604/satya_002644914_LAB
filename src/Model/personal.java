/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author prasad
 */
public class personal {
    private String NUID;
    private String First_Name;
    private String Last_Name;
    private String College_Name;
    contact contact;
    contact officialcontact;
    address address;
    address currentaddress;

    
    public personal(){
        this.NUID = "";
        this.First_Name = "";
        this.Last_Name = "";
        this.College_Name = "";
        this.contact = new contact();
        this.officialcontact = new contact();
        this.address = new address();
        this.currentaddress = new address();
        
    
}

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getCollege_Name() {
        return College_Name;
    }

    public void setCollege_Name(String College_Name) {
        this.College_Name = College_Name;
    }

    public contact getContact() {
        return contact;
    }

    public void setContact(contact contact) {
        this.contact = contact;
    }

    public contact getOfficialcontact() {
        return officialcontact;
    }

    public void setOfficialcontact(contact officialcontact) {
        this.officialcontact = officialcontact;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public address getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(address currentaddress) {
        this.currentaddress = currentaddress;
    }

    
}
