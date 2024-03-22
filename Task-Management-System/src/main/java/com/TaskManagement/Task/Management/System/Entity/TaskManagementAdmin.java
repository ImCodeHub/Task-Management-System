package com.TaskManagement.Task.Management.System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class TaskManagementAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "admin_name", nullable = false)
    private String AdminName;

    @Column(name = "mobile_number")
    private String MobileNumber;

    @Column(name = "email")
    private String Email;

    @Column(name = "password", nullable = false)
    private String Password;

    TaskManagementAdmin() {
        // default constructor
    }

    TaskManagementAdmin(Long id, String AdminName, String MobileNumber, String Email, String Password) {
        this.id = id;
        this.AdminName = AdminName;
        this.MobileNumber = MobileNumber;
        this.Email = Email;
        this.Password = Password;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
