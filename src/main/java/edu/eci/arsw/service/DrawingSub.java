/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.service;


import edu.eci.arsw.interfaces.DService;
import edu.eci.arsw.msgbroker.model.Drawing2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
   @Service
public class DrawingSub implements DService {
 
    
    public DrawingSub(){   
    }
    
    @Override
    public Map<String,Drawing2> getDrawing() throws DrawingServiceException {
        return driwing;
    }
    
    private static final Map<String, Drawing2>  driwing = new ConcurrentHashMap<>();

    
    static{
     driwing.put("circuloVerde", new Drawing2("rgb(087, 166, 057)",55,50,10));
     driwing.put("circuloMorado", new Drawing2("rgb(160, 052, 114)",20,20,10));
     
    }
      
 }


