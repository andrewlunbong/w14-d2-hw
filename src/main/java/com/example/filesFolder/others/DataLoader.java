package com.example.filesFolder.others;

import com.example.filesFolder.models.File;
import com.example.filesFolder.models.Folder;
import com.example.filesFolder.models.Person;
import com.example.filesFolder.repository.FileRepository;
import com.example.filesFolder.repository.FolderRepository;
import com.example.filesFolder.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;


@Profile("!test")
@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person andrew = new Person("Andrew");
        personRepository.save(andrew);

        Folder folder1 = new Folder("Folder", andrew);
        folderRepository.save(folder1);


        File file1 = new File("lots of files", "txt", "12", folder1);
        fileRepository.save(file1);
    }
}

