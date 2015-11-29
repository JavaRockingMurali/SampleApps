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
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> hashmap=new HashMap<String,String>();
        hashmap.put("First", "Murali");
        hashmap.put("Second", "Krishna");
        hashmap.put("third", "Alok");
        
        
        HashMap<String,String> submap=new HashMap<String,String>();
        submap.put("S1","SubMap1");
        submap.put("S2", "Submap2");
        hashmap.putAll(submap);
        
        Set<String> set=hashmap.keySet();
        for(String data:set){
            System.out.println("value Of"+data+":"+hashmap.get(data));
        }
        
        Iterator<Map.Entry<String,String>> itr=hashmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> map=itr.next();
            System.out.println(map.getKey()+":"+map.getValue());
            
        }
        
    }
    
}
