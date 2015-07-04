/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.luisalonsoparcial;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alonso
 */
public class GeneradorCalificaciones {
    
   
    public ArrayList<Evaluacion> generarCalificaciones() throws Exception{
        
        ArrayList<Evaluacion> calificaciones = new ArrayList<Evaluacion>();
        Evaluacion ev1 = new Evaluacion("Petra", 5.8f);
        Evaluacion ev2 = new Evaluacion("Jose", 7.4f);
        Evaluacion ev3 = new Evaluacion("Roberta", 8.6f);
        
        calificaciones.add(ev1);
        calificaciones.add(ev2);
        calificaciones.add(ev2);
        
        
    return calificaciones;
    }
    
}

        
             
             
        
    

    

