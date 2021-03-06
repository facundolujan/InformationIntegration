/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.*;

/**
 *
 * @author facu
 */
public class countryExtractor {

    public List<List<String>> getCountries(List<List<String>> imf, 
            List<List<String>> wefe, List<List<String>> wdd) throws Exception {    
        
        List<List<String>> result = new ArrayList<List<String>>();   
        
        //IMF
        for(int i = 1; i < imf.size(); i++) {
            List<String> rowReaded= imf.get(i);
            List<String> rowResult= new ArrayList<String>();
            
            String iso =rowReaded.get(0);
            String country =rowReaded.get(1);
            String incomingGroup = null;
            String region = null;
            rowResult.add(iso);
            rowResult.add(country);
            rowResult.add(incomingGroup);
            rowResult.add(region);
            
            result.add(rowResult);
            
        }
        
        //WEFD
        for(int i = 1; i < wefe.size(); i++) {
            List<String> rowReaded= wefe.get(i);
            List<String> rowResult= new ArrayList<String>();
            
            String iso =rowReaded.get(0);
            String country =rowReaded.get(1);
            String incomingGroup = rowReaded.get(2);
            String region = rowReaded.get(3);
            rowResult.add(iso);
            rowResult.add(country);
            rowResult.add(incomingGroup);
            rowResult.add(region);
            
            result.add(rowResult);
            
        }

        //WDD
        for(int i = 1; i < wdd.size(); i++) {
            List<String> rowReaded= wdd.get(i);
            List<String> rowResult= new ArrayList<String>();
            
            String iso =rowReaded.get(0);
            String country =rowReaded.get(1);
            String incomingGroup = null;
            String region = null;
            rowResult.add(iso);
            rowResult.add(country);
            rowResult.add(incomingGroup);
            rowResult.add(region);
            
            result.add(rowResult);
            
        }                      
        
        
        //Removing Duplicates
        Set<List<String>> hs = new HashSet<>();
        hs.addAll(result);
        result.clear();
        result.addAll(hs);

     //Adding ID   
        
        for(int i = 0; i < result.size(); i++) {
            String id=Integer.toString(i+1);
            result.get(i).add(0, id);
//            
//            List<String> rowReaded= result.get(i);
//            System.out.println(rowReaded.get(0));
//            System.out.println(rowReaded.get(1));
//            System.out.println(rowReaded.get(2));
//            System.out.println(rowReaded.get(3));
//            System.out.println(rowReaded.get(4));
        }
        
        
        return result;
        
    }
    
 public List<List<String>> getSourceWithCountryId(List<List<String>> source,
         List<List<String>> countries) throws Exception {       
     
   List<List<String>> result = new ArrayList<List<String>>();   
     
   
   for(int i = 1; i < source.size(); i++) {
       List<String> rowSource= source.get(i);    
       String countryId= this.getCountryID(countries,rowSource);
       rowSource.add(0,countryId);
       result.add(rowSource);
    }
          
     
     return result;
 }
 
 public String getCountryID(List<List<String>> countries,
         List<String> source) throws Exception { 
     String id="-1";
     
     for(int i = 0; i < countries.size(); i++) {
        List<String> rowCountry= countries.get(i); 
        
        
        
           if(rowCountry.get(1).equals(source.get(0))){
               id =rowCountry.get(0); 
            }
     }
     return id;
 }
 
 }