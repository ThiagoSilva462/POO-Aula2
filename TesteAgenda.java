package view;

import model.AgendaTelefonica;
import model.Contato;

public class TesteAgenda {
	
	public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        Contato contato1 = new Contato("João", "123456789", "joao@example.com");
        Contato contato2 = new Contato("Maria", "987654321", "maria@example.com");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        Contato encontrado = agenda.buscarContato("João");
        if (encontrado != null) {
            System.out.println("Contato encontrado: " + encontrado.getNome() + ", " + encontrado.getTelefone() + ", " + encontrado.getEmail());
        } else {
            System.out.println("Contato não encontrado.");
        }

        agenda.removerContato(contato2);

        encontrado = agenda.buscarContato("Maria");
        if (encontrado != null) {
            System.out.println("Contato encontrado: " + encontrado.getNome() + ", " + encontrado.getTelefone() + ", " + encontrado.getEmail());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

}
