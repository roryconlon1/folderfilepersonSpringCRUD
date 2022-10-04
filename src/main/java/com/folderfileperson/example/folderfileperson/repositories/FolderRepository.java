package com.folderfileperson.example.folderfileperson.repositories;

import com.folderfileperson.example.folderfileperson.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
