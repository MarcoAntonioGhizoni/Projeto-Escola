/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kleyton.155017
 */
public class Professor extends Pessoa{
    private float valorHora;
    public float salario;
    private Integer cargaHoraria;
    private ArrayList<Disciplina>disciplinas  = new ArrayList<>();

    public Professor(float valorHora, float salario, Integer cargaHoraria, String nome, String rg, String cpf, Date dataNascimento, Integer idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.valorHora = valorHora;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" + "valorHora=" + valorHora + ", salario=" + salario + ", cargaHoraria=" + cargaHoraria + ", disciplinas=" + disciplinas + '}';
    }
    
}
