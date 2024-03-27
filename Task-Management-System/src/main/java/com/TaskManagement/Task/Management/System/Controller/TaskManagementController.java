package com.TaskManagement.Task.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TaskManagement.Task.Management.System.Model.AddAdminRequest;
import com.TaskManagement.Task.Management.System.Model.UserDetails;
import com.TaskManagement.Task.Management.System.Service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TaskManagementController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addAdmin")
    public ResponseEntity<String> addPerson(@RequestBody AddAdminRequest Admin) {
        String response = adminService.addAdmin(Admin);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/manager")
    public ResponseEntity<List<UserDetails>> getManagerName() {
        List<UserDetails> userDetails = adminService.getmanagers();
        return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletePerson/{id}")
    public ResponseEntity<String> deletPerson(@PathVariable Long id) {
        boolean deleteResponse = adminService.deletePerson(id);
        if (deleteResponse) {
            return new ResponseEntity<>("Person has been Deleted", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Person not found", HttpStatus.CREATED);
        }
    }

}
