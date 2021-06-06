/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**Luvolwethu James, 219126224
 *11 May 2021
 * @author Miss James
 */
public class RegistrationForm {
    public String Title;
    public String Firstname;
    public String Surname;
    public String Gender;
    public String Pensioner;

    public RegistrationForm(String Title, String Firstname, String Surname, String Gender, String Pensioner) {
        this.Title = Title;
        this.Firstname = Firstname;
        this.Surname = Surname;
        this.Gender = Gender;
        this.Pensioner = Pensioner;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPensioner() {
        return Pensioner;
    }

    public void setPensioner(String Pensioner) {
        this.Pensioner = Pensioner;
    }
    
}
