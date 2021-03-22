/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class Main {
    
    public static void main(String[] args) {
          Employee box1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

        Employee box2 = new Employee("Mark Jones", 39119, "IT", "Programmer");

        Employee box3 = new Employee("Joy Rodgers", 81774, "Manufacturing", "Engineer");

        

        System.out.println(" Name          ID Number      depart      Position    ");

        System.out.println("_______________________________________________________");

        System.out.print(" " + box1.get_Name() + "    " + box1.getid_number() + "          " + box1.getdepart());

        System.out.println("      " + box1.get_Position());

        System.out.print(" " + box2.get_Name() + "      " + box2.getid_number() + "          " + box2.getdepart());

        System.out.println("              " + box2.get_Position());

        System.out.print(" " + box3.get_Name() + "     " + box3.getid_number() + "          " + box3.getdepart());

        System.out.println("   " + box3.get_Position());
    }
      
}
