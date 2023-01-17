// CLASSE DE CADASTRO DE USUARIOS...

import java.util.Scanner;
import java.util.ArrayList;
public class Usuarios {

    public static void main(String[] args) {
     
        Scanner l = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
        
        System.out.println("Digite os dados: "+"\nNome ");
        
        String nome = l.next();
        
        System.out.println("Data de nascimento ");
        
        int DataNascimento = l.nextInt();
        
        System.out.println("endereco ");
        
        String endereco = l.next();
        
        System.out.println("cidade");
        
        String cidade = l.next();
        
        
        Dados usuario;
        
        usuario = new Dados();
        
        usuario.setNome(nome);
        usuario.setDataNascimento(DataNascimento);
        usuario.setEndereco(endereco);
        usuario.setCidade(cidade);
        
        
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        
        usuarios.add(usuario);
        
        System.out.println(usuario.getNome()+"\n"+usuario.getDataNascimento()+"\n"+usuario.getEndereco());
     }


}

