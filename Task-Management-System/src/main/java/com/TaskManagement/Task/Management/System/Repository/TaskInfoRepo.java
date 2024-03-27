package com.TaskManagement.Task.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskManagement.Task.Management.System.Entity.TaskInfo;

public interface TaskInfoRepo extends JpaRepository<TaskInfo,Long> {
    
}
