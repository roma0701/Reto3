/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.ciclo3.ciclo3.Repository;

import co.ciclo3.ciclo3.Repository.crud.AuditorioCrud;
import co.ciclo3.ciclo3.modelo.Auditorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ANDRES REY
 */
@Repository
public class AuditorioRepositorio {
    @Autowired
    private AuditorioCrud auditoriocrud;
    public List<Auditorio> getAll(){
        return (List<Auditorio>) auditoriocrud.findAll();
    }
    public Optional<Auditorio> getAuditorio(int id){
        return auditoriocrud.findById(id);
    }
    public Auditorio save(Auditorio a){
        return auditoriocrud.save(a);
    }
            
}

