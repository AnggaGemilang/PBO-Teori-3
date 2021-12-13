/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author angga
 */

class Documents {
    private ArrayList<String> authors = new ArrayList<>();
    private Date date;
    
    public Documents(ArrayList<String> authors, Date date){
        this.authors = authors;
        this.date = date;
    }
    
    public ArrayList<String> getAuthors(){
        return authors;
    }
    
    public void addAuthor(String name){
        authors.add(name);
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public void showData(){
        System.out.println("Authors : " + authors);
        System.out.println("Date : " + date);
    }
}

class Book extends Documents {
    private String title;

    public Book(ArrayList<String> authors, Date date, String title) {
        super(authors, date);
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    @Override
    public void showData(){
        super.showData();
        System.out.println("Title : " + title);
    }
}

class Email extends Documents {
    private String subject;
    private ArrayList<String> to = new ArrayList<>();

    public Email(ArrayList<String> authors, Date date, String subject, ArrayList<String> to) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to.add(to);
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("Subject : " + subject);
        System.out.println("To : " + to);
    }
    
}

public class Inheritance {

    public static void main(String[] args){
        Book book = new Book(
                new ArrayList<>(Arrays.asList("Sabihis Jaya", "Suwarko", "Angga")), 
                new Date(2021, 12, 12), 
                "Perjalanan Hidup");
        book.showData();
        System.out.println("");
        Email email = new Email(
                new ArrayList<>(Arrays.asList("Angga Gemilang")), 
                new Date(2021, 12, 12), 
                "Tugas Kuliah", 
                new ArrayList<>(Arrays.asList("Nanang", "jaja"))
        );
        email.showData();

    }
    
}
