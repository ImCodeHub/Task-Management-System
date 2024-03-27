package com.TaskManagement.Task.Management.System.TaskServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManagement.Task.Management.System.Entity.TaskManagementAdmin;
import com.TaskManagement.Task.Management.System.Model.AddAdminRequest;
import com.TaskManagement.Task.Management.System.Model.UserDetails;
import com.TaskManagement.Task.Management.System.Repository.TaskManagementRepository;
import com.TaskManagement.Task.Management.System.Service.AdminService;

@Service
public class TaskManagementServiceImpl implements AdminService {

    @Autowired
    private TaskManagementRepository taskRepository;

    // saving admin details inside database.
    @Override
    public String addAdmin(AddAdminRequest admin) {
        TaskManagementAdmin obj = new TaskManagementAdmin(admin.getAdminName(), admin.getMobileNumber(),
                admin.getEmail(), admin.getPassword(), admin.getUserType(), admin.getReportsTo());
        taskRepository.save(obj);
        return "Admin saved Successfully";
    }

    @Override
    public List<UserDetails> getmanagers() {
        List<UserDetails> response = new ArrayList<>();
        List<TaskManagementAdmin> admins = taskRepository.findByUserType("manager");
        for (TaskManagementAdmin admin : admins) {
            response.add(new UserDetails(admin.getId(), admin.getAdminName()));
        }
        return response;
    }

    @Override
    public boolean deletePerson(Long id) {
        Optional<TaskManagementAdmin> optionalPerson = taskRepository.findById(id);
        if(optionalPerson.isPresent()){
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
