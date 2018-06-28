/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dansoft.AprendizagemJavaEE;

/**
 *
 * @author biblioteca
 */
import javax.persistence.*;

public class CriaTabela {
    
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("AprendizagemJavaEE");
    }
    
}
