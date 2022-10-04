package com.folderfileperson.example.folderfileperson.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="name")
    public String name;
    @Column(name="extension")
    public String extension;
    @Column(name="size_in_mb")
    public int sizeInMb;

    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    @JsonIgnoreProperties({"files", "folder"})
    private Folder folder;

    public File(String name, String extension, int sizeInMb, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.sizeInMb = sizeInMb;
        this.folder = folder;
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSizeInMb() {
        return sizeInMb;
    }

    public void setSizeInMb(int sizeInMb) {
        this.sizeInMb = sizeInMb;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
