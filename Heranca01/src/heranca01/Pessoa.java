/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca01;

/**
 *
 * @author Luciano Martinez
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }    

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '.';
    }
    
    
    
}
