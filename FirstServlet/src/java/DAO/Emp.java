/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author SHAHADAT
 */
public class Emp {
    
    public static int save(Employee e){  
        int status=0;  
        try{  
            Connection con = DatabaseConnection.connect();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into employees(name,mobile,age) values (?,?,?)");  
            ps.setString(1, e.getName());
            ps.setString(2, e.getMobile());
            ps.setString(3, e.getAge());
              
            status = ps.executeUpdate();
            con.close();
        }catch(Exception ex){ex.printStackTrace();}  
        
        return status;
    }
    
    public static int update(Employee e){  
        int status=0;  
        try{  
            Connection con = DatabaseConnection.connect();  
            PreparedStatement ps=con.prepareStatement(  
                         "update employees set name=?,mobile=?,age=? where id=?");  
            ps.setString(1, e.getName());
            ps.setString(2, e.getMobile());
            ps.setString(3, e.getAge());
            ps.setInt(4, e.getId());
              
            status = ps.executeUpdate();
            con.close();
        }catch(Exception ex){ex.printStackTrace();}  
        
        return status;
    }
    
    public static int delete(int empId){
        int status = 0;
        try{
            Connection con = DatabaseConnection.connect();
            PreparedStatement ps = con.prepareStatement("delete from employees where id=?");
            ps.setInt(1, empId);
            
            status = ps.executeUpdate();
        } catch(Exception ex){
            
        }
        
        return status;
    }
    
    public static List<Employee> getAll(){
        List<Employee> empList = new ArrayList<Employee>();
        
        try{  
            Connection con = DatabaseConnection.connect(); 
            PreparedStatement ps = con.prepareStatement("select id, name, mobile, age from employees;");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Employee e = new Employee();
                e.setId( rs.getInt(1) );
                e.setName( rs.getString(2) );
                e.setMobile( rs.getString(3) );
                e.setAge( rs.getString(4) );
                
                empList.add(e);
            }
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return empList;
    }
    
    public static Employee getEmployee(String id){
        Employee e = new Employee();
        
        try{
            Connection con = DatabaseConnection.connect();
            PreparedStatement ps = con.prepareStatement("select name, mobile, age from employees where id=" + id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                e.setName( rs.getString(1) );
                e.setMobile( rs.getString(2) );
                e.setAge( rs.getString(3) );
            }
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return e;
    }
}
