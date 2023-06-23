/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Hansol
 */
import java.util.Scanner;
public class TestUserprofile {
    
    public static void main (String []args){
        final String [] Genre ={"Comedy", "Drama", "Action", "Mystery"};
        System.out.print("To create a user profile, input your desire name followed by a Genre from the following: ");
        for (int i = 0; i < Genre.length; i++){
            System.out.print(Genre[i] + " ");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.next();
        System.out.print("Enter Genre: ");
        String genre = input.next();
        UserProfile user1 = new UserProfile(username, genre);
        System.out.println("Your account " + user1 + " has been successfully created");
    }
}
