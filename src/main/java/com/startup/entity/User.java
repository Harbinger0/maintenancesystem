package com.startup.entity;

import java.util.Objects;

public class User {

    private String userId;
    private String name;
    private String lastname;

    public User(){

    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.lastname = builder.lastname;
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

    public static class Builder {

        private String userId;
        private String name;
        private String lastname;

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

        public Builder copy(User user){
            this.userId = user.userId;
            this.name = user.name;
            this.lastname = user.lastname;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "user{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
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




