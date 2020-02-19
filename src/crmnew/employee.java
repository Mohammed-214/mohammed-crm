/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crmnew;

/**
 *
 * @author Mohammed Al Moqayad
 */
public class employee {
    private String id;
    private String name;
    private String phone;
    private String email;
    private String property;
    private String LC;
    private String status;

    /**
     *
     * @param id
     * @param name
     * @param phone
     * @param email
     * @param property
     * @param LC
     * @param status
     */
    public employee(String id, String name, String phone, String email, String property, String LC, String status){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email =  email;
        this.property = property;
        this.LC = LC;
        this.status = status;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the emaill
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the property
     */
    public String getProperty() {
        return property;
    }

    /**
     * @param property the property to set
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * @return the LC
     */
    public String getLC() {
        return LC;
    }

    /**
     * @param LC the LC to set
     */
    public void setLC(String LC) {
        this.LC = LC;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
