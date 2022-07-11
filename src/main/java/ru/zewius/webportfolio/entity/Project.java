package ru.zewius.webportfolio.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "repos_list")
public class Project {

    @Id
    @Column(name = "repo_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "repo_name")
    @NotBlank(message = "Name is a mandatory field")
    private String name;

    @Column(name = "repo_description")
    private String description;

    @Column(name = "repo_link")
    private String link;

    public Project() {
    }

    public Project(String name, String description, String link) {
        this.name = name;
        this.description = description;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
