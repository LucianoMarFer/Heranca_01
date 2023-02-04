/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca01;

/**
 *
 * @author Luciano Martinez
 */
public class Heranca01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("hello world!");
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");
        
        p1.setIdade(28);
        p2.setIdade(19);
        p3.setIdade(49);
        p4.setIdade(34);
        
        p4.fazerAniver();
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
//        p1.setNome("Luciano");
//        p1.setIdade(25);
//        p1.fazerAniver();
//        
//        p2.setCurso("ADS");
//        p3.setNome("Professor");
//        System.out.println(p1.getNome());
//        System.out.println("-------------");
//        System.out.println(Integer.toString(p1.getIdade()));
        
    }
    
}
