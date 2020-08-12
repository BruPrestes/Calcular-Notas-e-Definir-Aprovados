package application;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o nome do curso: ");
        String nome = sc.nextLine();
        
        System.out.println("Entre com o horário do curso: ");
        String horario = sc.nextLine();
        
        System.out.println("Entre com o nome do professor: ");
        String nomeProf = sc.nextLine();
        
        System.out.println("Entre com o departamento do professor: ");
        String depProf = sc.nextLine();
        
        System.out.println("Entre com o email do professor: ");
        String emailProf = sc.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);
        
        curso.setProfessor(professor);
        
        System.out.println("---Alunos---");
        
        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            
            sc.nextLine();
            
            System.out.println("Entre com o nome do aluno " + (i+1));
            String nomeAluno = sc.nextLine();
            
            System.out.println("Entre com a matrícula do aluno " + (i+1));
            String matAluno = sc.nextLine();
        
        //declarei um array para receber as notas    
        double[] notas = new double[4];
        
            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota: " + (j+1));
                //como notas já foi declarado ele irá receber o valor digitado na posição do vetor
                notas[j] = sc.nextDouble();
            }
        
        Aluno aluno = new Aluno();
        aluno.setNome(nomeAluno);
        aluno.setMatricula(matAluno);
        aluno.setNotas(notas);
        
        alunos[i] = aluno;
        
        }
        //agora que o objeto alunos já foi preenchido com todas as informações que foi passada no for
        //então eu posso setar no set alunos a coleção de objetos
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
}
