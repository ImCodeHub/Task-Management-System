package com.TaskManagement.Task.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskManagement.Task.Management.System.Entity.TaskManagementAdmin;

public interface TaskManagementRepository extends JpaRepository<TaskManagementAdmin,Long> {
    
}
