package app.oop.exercises;

import java.sql.Date;

public class Person {
    private int id;
    protected String firstName;
    protected String lastName;
    private Date dateOfBirth;
    //Default constructor
    public Person(){

    }
    public Person(int id, String firstName, String lastName, Date dateOfBirth){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(String firstName, String lastName, Date dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth= dateOfBirth;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void print(){
        System.out.println("I am a person");
    }
    public String print(String name, int number){
        return "I am "+name+" "+number;
    }
    public void print(String title){
        System.out.println("I am "+ title);
    }
    @Override
    public String toString(){
        return "Person Id is "+this.id+"I am "+ this.firstName+" "+ this.lastName+ "My date of birth is "+this.dateOfBirth;
    }
}

//Created a table remaining to verify if the connection runs and then change the data entrance from compile time to runtime... MuPro...
