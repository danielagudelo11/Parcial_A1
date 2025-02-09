/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daguduq.Parcial_A1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author danie
 */
@RestController
public class MiControlador {
        @GetMapping("/publico")
    public String publico() {
        return "Este es un contenido público.";
    }

    @GetMapping("/privado")
    public String privado() {
        return "Este es un contenido privado.";
    }
}
