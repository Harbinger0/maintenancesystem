package com.startup.entity.contact;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author @CloeteSC
 * Desc: Entity for Contact
 * Date: 27 October 2020
 */
@Entity

public class Contact{

    @Id
    private String phone;
    private String email;
    private String homephone;

    protected Contact(){
    }

    private Contact(Builder builder){
        this.phone = builder.phone;
        this.email = builder.email;
        this.homephone = builder.homephone;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getHomephone() {
        return homephone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone: '" + phone + '\'' +
                ",email: '" + email + '\'' +
                ",homephone: '" + homephone + '\'' +
                '}';
    }

    public static class Builder{
        public String phone;
        public String email;
        public String homephone;


        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setHomephone(String homephone){
            this.homephone = homephone;
            return this;
        }

        public Contact.Builder copy(Contact contact){
            this.phone = contact.phone;
            this.homephone = contact.homephone;
            this.email = contact.email;

            return this;
        }


        public Contact build(){
            return new Contact(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phone.equals(contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }
}
