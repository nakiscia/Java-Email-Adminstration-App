package emailapp;

import java.util.*;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String altarnateEmail;
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("First Name : " + this.firstName + " Last Name:" + this.lastName);

        this.department = this.setDepartment();
        this.password = this.generatePassword(defaultPasswordLength);
        System.out.println("Department : " + this.department);
        System.out.println("Password : " + this.password);
    }

    private String setDepartment(){
        System.out.println("Department Codes :\n1: Development" +
                "\n2:Accounting" +
                "\n3:Sales" +
                "\n0:None" +
                "\nEnter Department code:");

        Scanner sc = new Scanner(System.in);
        int depCode = sc.nextInt();
        if(depCode == 1){ return "Development"; }
        else if (depCode == 2) { return "Accounting"; }
        else if (depCode == 3) { return "Sale"; }
        else {return "";}
    }

    private String generatePassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNPQRSTUVWXVZ0123456789#$%^&*@()!";
        char[] password = new char[length];

        for(int i =0; i < length; i++)
        {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }


}
