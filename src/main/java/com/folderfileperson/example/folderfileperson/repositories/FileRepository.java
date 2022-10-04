package com.folderfileperson.example.folderfileperson.repositories;

import com.folderfileperson.example.folderfileperson.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
