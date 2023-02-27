/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_arrangement;

/**
 *
 * @author Tech
 */
public class User {
    private String username,email,contact,gender;
    
    public User(String username,String email,String contact,String gender){
    this.username=username;
    this.email=email;
    this.contact=contact;
    this.gender=gender;
    }
    public String getUsername(){
    return username;
    }
    public String getEmail(){
    return email;
    }
    public String getContact(){
    return contact;
    }
    public String getGender(){
    return gender;
    }
    public void setUsername(String username){
    this.username=username;
    }
    public void setEmail(String email){
    this.email=email;
    }
    public void setContact(String contact){
    this.contact=contact;
    }
    public void setGender(String gender){
    this.gender=gender;
    }
    
}
