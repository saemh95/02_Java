package edu.kh.exception.test;

import java.util.*;

public class RegistrationExample {
	public static void main(String[] args) {
		try {
            registerUser("John Doe", 16); // Attempt to register a user under the age limit.
        } catch (AgeRestrictionException e) {
            System.out.println("Registration failed: " + e.getMessage());
            
        }
	 List<String> al = new ArrayList<>();  
        
        // Now add the elements in the List  
        al.add(0, "BMW");  
        al.add(1, "Hundai");  
//        al.add(1, "Hundai");  
//        al.add("Hundai");  
//        al.add("Hundai");  
        al.add(2, "Toyota");  
        al.add(3, "Swift");  
        al.add(4, "hello");
        System.out.println(al.size());
//        al.remove("Hundai");
        
//        al.update("He");
  
        // Iterating the List  
        // element using for-each loop  
        for (String cars : al)  
            System.out.println(cars);  
        
        Set<String> Set = new HashSet<String>();  
        
        // Adding some Elements   
        Set.add("Java");  
        Set.add("Java");  
        Set.add("Apple");  
        Set.add("Python");  
        Set.add("DBMS");  
        Set.add("Machine Learning");  
        Set.add("Operating System");  
        Set.add("Operating System");  
  
        // Here Set follows unordered way.  
        System.out.println(Set);  
        
     // Creating object for a Map.  
        Map<String, Integer> map = new HashMap<String, Integer>();  
  
        // Adding Elements using Map.  
        map.put( "Rajat", 101);  
        map.put("Shyam", 102);  
        map.put("Rahul", 103);  
        map.put("Krishna", 104);  
        map.put("Rahuly", 103);  
        // here, elements may traverse in any order  
        for (Map.Entry m : map.entrySet()) {  
            System.out.println(m.getKey() + " "  
                               + m.getValue());  
        }  
    }
	

    public static void registerUser(String name, int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException(name + " User must be 18 years or older.");
        }
        System.out.println(name + " User registered successfully.");
        
       
    }  
}
