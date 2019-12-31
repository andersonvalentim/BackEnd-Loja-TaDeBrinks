/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.cirilo.FoiBrinks.repository;

import com.br.cirilo.FoiBrinks.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Vectro26 Network
 */
public interface ClientesRepository extends JpaRepository<Clientes,Integer>{
    
}
