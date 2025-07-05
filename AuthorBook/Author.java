/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspboaufa;

/**
 *
 * @author aufaa
 */
public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nNama Author = " + this.name + 
               "\nEmail = " + this.email;
    }
}
