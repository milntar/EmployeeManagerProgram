/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagerprogram;

import java.util.ArrayList;

/**
 *
 * @author J279720
 */
public class Manager extends Employee {
    
    private ArrayList<Employee> employees = new ArrayList<>();
    
    public Manager(String name, int employeeNum) {
        super(name, employeeNum);
    }
    
    public void addEmployee(Employee empNew){
        employees.add(empNew);
    }
    
    public void removeEmployee(Employee existingEmp){
        employees.remove(existingEmp);
    }
    
    @Override
     public String printDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append(employeeNum + " ");
        sb.append(name + " ");
        sb.append("\n"); //newline character
        for (Employee e : employees){
            sb.append("Employee: " + e.name);
            sb.append("\n"); //newline character
        }
        return sb.toString();
    }
}
