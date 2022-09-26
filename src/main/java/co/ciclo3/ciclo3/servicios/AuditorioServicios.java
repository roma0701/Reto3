/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.ciclo3.ciclo3.servicios;

import co.ciclo3.ciclo3.Repository.AuditorioRepositorio;
import co.ciclo3.ciclo3.modelo.Auditorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANDRES REY
 */
@Service
public class AuditorioServicios {
    @Autowired
    private AuditorioRepositorio auditoriorepositorio;
     public List<Auditorio>  getAll(){
         return  auditoriorepositorio.getAll();   
     }
     public Optional<Auditorio> getAuditorio(int id){
         return auditoriorepositorio.getAuditorio(id);
     }
     
     public Auditorio seve(Auditorio a){
         if(a.getId()==null){
             return auditoriorepositorio.save(a);
         }else{
            Optional<Auditorio> audiauxi= auditoriorepositorio.getAuditorio(a.getId());
            if (audiauxi.isEmpty()){
                return  auditoriorepositorio.save(a);
            }else{
                return a;
            }
         }  
     }

    public Auditorio save(Auditorio a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

