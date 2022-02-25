/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author aulak
 */
public class TestUserprofile {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your favourite Genre(Comedy, Drama, Action, Mystery): ");
        String genre = sc.nextLine();
        UserProfile u1 = new UserProfile(name, genre);
        System.out.println("User ID  " + u1.getUserID());
        System.out.println("Genre"+u1.getGenre());
        System.out.println("user is created");
    }
    
}
