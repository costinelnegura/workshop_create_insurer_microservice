package com.costinel.workshop_create_insurer_microservice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Insurer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String insurerName;

    @Column
    private String insurerAddress;

    @Column
    private String insurerPostCode;

    @Column
    private String insurerPhoneNumber;

    @Column
    private String insurerEmailAddress;

    public Insurer(long id, String insurerName, String insurerAddress, String insurerPostCode, String insurerPhoneNumber, String insurerEmailAddress) {
        this.id = id;
        this.insurerName = insurerName;
        this.insurerAddress = insurerAddress;
        this.insurerPostCode = insurerPostCode;
        this.insurerPhoneNumber = insurerPhoneNumber;
        this.insurerEmailAddress = insurerEmailAddress;
    }

    public Insurer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getInsurerAddress() {
        return insurerAddress;
    }

    public void setInsurerAddress(String insurerAddress) {
        this.insurerAddress = insurerAddress;
    }

    public String getInsurerPostCode() {
        return insurerPostCode;
    }

    public void setInsurerPostCode(String insurerPostCode) {
        this.insurerPostCode = insurerPostCode;
    }

    public String getInsurerPhoneNumber() {
        return insurerPhoneNumber;
    }

    public void setInsurerPhoneNumber(String insurerPhoneNumber) {
        this.insurerPhoneNumber = insurerPhoneNumber;
    }

    public String getInsurerEmailAddress() {
        return insurerEmailAddress;
    }

    public void setInsurerEmailAddress(String insurerEmailAddress) {
        this.insurerEmailAddress = insurerEmailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurer insurer = (Insurer) o;
        return id == insurer.id && Objects.equals(insurerName, insurer.insurerName) && Objects.equals(insurerAddress, insurer.insurerAddress) && Objects.equals(insurerPostCode, insurer.insurerPostCode) && Objects.equals(insurerPhoneNumber, insurer.insurerPhoneNumber) && Objects.equals(insurerEmailAddress, insurer.insurerEmailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, insurerName, insurerAddress, insurerPostCode, insurerPhoneNumber, insurerEmailAddress);
    }

    @Override
    public String toString() {
        return "Insurer{" +
                "id=" + id +
                ", insurerName='" + insurerName + '\'' +
                ", insurerAddress='" + insurerAddress + '\'' +
                ", insurerPostCode='" + insurerPostCode + '\'' +
                ", insurerPhoneNumber='" + insurerPhoneNumber + '\'' +
                ", insurerEmailAddress='" + insurerEmailAddress + '\'' +
                '}';
    }
}
