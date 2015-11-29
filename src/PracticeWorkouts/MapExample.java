/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeWorkouts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MURALI
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(730, "Murali");
        map.put(731,"Krishna");
        map.put(732, "Mahesh");
        
        if(map.containsKey(730)){
            System.out.println("The Employee Avalilable in the list");
        }
        
        Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> mapen=itr.next();
            int id=mapen.getKey();
            String name=mapen.getValue();
            System.out.println(id+":"+name);
        }
        
    }
    
}
