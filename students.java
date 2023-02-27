
package seating_arrangement;


class students {
    private String firstname,lastname,email,contact,gender,yob;
    public students(String firstname,String lastname,String email,String contact,String gender, String yob){
    this.firstname=firstname;
    this.lastname=lastname;
    this.email=email;
    this.contact=contact;
    this.gender=gender;
    this.yob=yob;
    }
    public String getFirstname(){
    return firstname;
    }
    public String getLastname(){
    return lastname;
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
    public String getYob(){
    return yob;
    }
    public void setFirstname(String firstname){
    this.firstname=firstname;
    }
    public void setLastname(String lastname){
    this.lastname=lastname;
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
    public void setYob(String yob){
    this.yob=yob;
    }
    
}
