/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeWorkouts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author MURALI
 */
public class PropertiesExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream(new File("C:\\Users\\MURALI\\Documents\\NetBeansProjects\\SampleApp\\src\\PracticeWorkouts\\Murali.properties"));
        prop.load(fis);
        System.out.println("Name:"+prop.getProperty("mk.name"));
        
    }
    
}
