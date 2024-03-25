package com.TaskManagement.Task.Management.System.Service;

import java.util.List;

import com.TaskManagement.Task.Management.System.Model.AddAdminRequest;
import com.TaskManagement.Task.Management.System.Model.UserDetails;

public interface AdminService {
    public String addAdmin(AddAdminRequest Admin);

    public List<UserDetails> getmanagers();
}
