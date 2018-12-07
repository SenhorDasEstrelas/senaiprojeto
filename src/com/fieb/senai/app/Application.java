package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;
import com.fieb.senai.entidades.Telefone;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args)  {
        
//Instanciamento de objetos das classes Pessoa, Endereco:
    Pessoa p1 = new Pessoa("Maria",45431,42);
    Endereco end1 = new Endereco("Jogo do carneiro", "25", "Graça");
    Telefone tel1 = new Telefone("33121130");
    
    Pessoa p2 = new Pessoa("Juninho",133, 7);
    Endereco end2 = new Endereco ("Rua dos Loucos", "13", "Itapuã");
    Telefone tel2 = new Telefone("33129217");

//Lista de Telefone:
List<Telefone> listaTelefone1 = new ArrayList<>();
List<Telefone> listaTelefone2 = new ArrayList<>();

//Declarando a associação:
    p1.setEndereco(end1);
    p1.setTelefone(listaTelefone1);
    p2.setEndereco(end2);
    p2.setTelefone(tel2);
    
    
    }  
}