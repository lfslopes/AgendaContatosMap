package contatos_agenda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AgendaContatos {
    private final Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new TreeMap<>();
    }
    public AgendaContatos(Map<String, Integer> contatos) {
        this.contatos = contatos;
    }
    public AgendaContatos(Contato...contatos) {
        this.contatos = new TreeMap<>();
        for (Contato contato : contatos) {
            this.contatos.put(contato.getNome(), contato.getTelefone());
        }
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.contatos.put(nome, telefone);
    }
    public void removerContato(String nome) {
        this.contatos.remove(nome);
    }
    public void exibirContatos() {
        this.contatos.forEach((k, v) -> System.out.println("Contato: " + k + " --- Telefone: " + v));
    }
    public Integer pesquisarPorNome(String nome) {
        return this.contatos.get(nome);
    }
}
