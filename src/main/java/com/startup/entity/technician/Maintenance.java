package com.startup.entity.technician;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author: Christ Amour NM
 * Desc: Entity
 * Date: 30 June 2020
 */


@Entity
public class Maintenance implements Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String maintenanceId;
    private String name;
    private String lastname;

    private String gender;
    private String profession;
    private String phonenumber;
    private String emailm;



    protected Maintenance() {
    }

    private Maintenance(Builder builder) {
        this.maintenanceId = builder.maintenanceId;
        this.name = builder.name;
        this.lastname = builder.lastname;
        this.gender = builder.gender;
        this.profession = builder.profession;
        this.phonenumber = builder.phonenumber;
        this.emailm = builder.emailm;
    }

    public String getMaintenanceId() {
        return maintenanceId;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmailm() {
        return emailm;
    }

    public static class Builder {

        private String maintenanceId;
        private String name;
        private String lastname;

        private String gender;
        private String profession;
        private String phonenumber;
        private String emailm;


        public Builder maintenanceId(String maintenanceId) {
            this.maintenanceId = maintenanceId;
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

        public Builder emailm(String emailm) {
            this.emailm = emailm;
            return this;
        }

        public Builder phonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder profession(String profession) {
            this.profession = profession;
            return this;
        }


        public Builder copy(Maintenance maintenance){
            this.maintenanceId = maintenance.maintenanceId;
            this.name = maintenance.name;
            this.lastname = maintenance.lastname;
            this.gender = maintenance.gender;
            this.phonenumber = maintenance.phonenumber;
            this.emailm = maintenance.emailm;
            this.profession = maintenance.profession;

            return this;
        }

        public Maintenance build() {
            return new Maintenance(this);
        }

    }


    @Override
    public String toString() {
        return "Maintenance{" +
                "maintenanceId='" + maintenanceId + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", profession='" + profession + '\'' +
                ", phonenumber=" + phonenumber +
                ", emailm='" + emailm + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maintenance maintenance = (Maintenance) o;
        return maintenanceId.equals(maintenance.maintenanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maintenanceId);
    }
}
