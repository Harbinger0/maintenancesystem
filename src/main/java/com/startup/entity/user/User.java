/*
 User class
 2/07/2020
 215285840
 */

package com.startup.entity.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String userId;
    private String name;
    private String lastname;

    private String userName;
    private String password;
    private String emailId;

    protected User(){

    }




    private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.lastname = builder.lastname;

        this.emailId = builder.emailId;
        this.password = builder.password;
        this.userName = builder.userName;
    }


    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailId() {
        return emailId;
    }


    public static class Builder {

        private String userId;
        private String name;
        private String lastname;

        private String userName;
        private String password;
        private String emailId;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder emailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.name = user.name;
            this.lastname = user.lastname;
            this.emailId = user.emailId;
            this.userName = user.userName;
            this.password = user.password;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }


}




