package com.example.filesFolder.repository;

import com.example.filesFolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FileRepository extends JpaRepository<File, Long> {
}
