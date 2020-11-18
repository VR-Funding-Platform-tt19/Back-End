package com.buildweek.virtualrealityfunding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="projects")
public class Project extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(name = "projectid", value = "primary key for Project")

    //primary key
    private long projectid;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "investorid")
    @JsonIgnoreProperties("project")
    //ties investor to investor projects
    private List<Investor> investors = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("projects")
    private User user;

    private String projectname;
    private String description;
    private String author;
    private String projectimage;
    private int fundedamt;


    public Project()
    {
    }

    public Project(User user, String projectname, String description, String author, String projectimage, int fundedamt)
    {
        this.projectname = projectname;
        this.description = description;
        this.author = author;
        this.projectimage = projectimage;
        this.fundedamt = fundedamt;
    }

    public Project(String projectname, int fundedamt)
    {
        super();
    }

    public Project(String projectname, int fundedamt, String author, User newUser)
    {
        super();
    }

    public long getProjectid()
    {
        return projectid;
    }

    public void setProjectid(long projectid)
    {
        this.projectid = projectid;
    }
//
//    public List<Investor> getInvestors()
//    {
//        return investors;
//    }
//
//    public void setInvestors(List<Investor> investors)
//    {
//        this.investors = investors;
//    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User User)
    {
        this.user = user ;
    }

    public String getProjectname()
    {
        return projectname;
    }

    public void setProjectname(String projectname)
    {
        this.projectname = projectname;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getauthor()
    {
        return author;
    }

    public void setauthor(String author)
    {
        this.author = author;
    }

    public String getProjectimage()
    {
        return projectimage;
    }

    public void setProjectimage(String projectimage)
    {
        this.projectimage = projectimage;
    }

    public int getFundedamt()
    {
        return fundedamt;
    }

    public void setFundedamt(int fundedamt)
    {
        this.fundedamt = fundedamt;
    }
}

