package com.folderfileperson.example.folderfileperson.components;

import com.folderfileperson.example.folderfileperson.models.File;
import com.folderfileperson.example.folderfileperson.models.Folder;
import com.folderfileperson.example.folderfileperson.models.Person;
import com.folderfileperson.example.folderfileperson.repositories.FileRepository;
import com.folderfileperson.example.folderfileperson.repositories.FolderRepository;
import com.folderfileperson.example.folderfileperson.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public void run(ApplicationArguments args) {
        Person person = new Person("John");
        personRepository.save(person);
        Folder folder1 = new Folder("Python", person);
        folderRepository.save(folder1);
        File file1 = new File("chickens in chickens", "py", 3, folder1);
        fileRepository.save(file1);
    }
}
