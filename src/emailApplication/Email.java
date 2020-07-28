package emailApplication;

import java.util.Scanner;

public class Email {
    Scanner sc = new Scanner(System.in);
    // Fields or Instance Variable

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int passwordLength = 8;
    private String companyId = "gmail.com";
    private int capacity = 500;
    private String altEmail;
    private String email;

    // Constructor start from here
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("The name is: "+this.firstName + " "+this.lastName);

        this.department = setDepartment();
        //System.out.println("Department: "+this.department);
        this.password = randomPassword(passwordLength);
        //System.out.println("Your password is: "+this.password);

        email = firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+companyId;
        //System.out.println("Your email is: "+email);
    }


    // Methods start from here
    public String setDepartment(){ //setDepartment Start from here
        System.out.println("Enter number\n1 for Management\n2 for Accounting\n3 for Marketing\n4 for CSE");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("management");
                break;
            case 2:
                System.out.println("accounting");
                break;
            case 3:
                System.out.println("marketing");
                break;
            case 4:
                System.out.println("cse");
                break;
            default:
                return "Please chose the right option";
        }
        return "Department: "+this.department;
    }// SetDepartment End in here



    public String randomPassword(int length){
        String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //int charLength = allChar.length();
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * allChar.length());
            password[i] = allChar.charAt(rand);
        }
        return new String(password);
    }// randomPassword Method ends


    // Setters Method start from here
    public void setPassword(String password){
        this.password = password;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setAltEmail(String email){
        this.altEmail = email;
    }

    public String show(){
        return  "EMP NAME: "+firstName + lastName +
                "\nEMP PASSWORD: "+ this.password +
                "\nEMP EMAIL: "+ email;
    }
}
