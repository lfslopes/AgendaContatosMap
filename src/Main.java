import contatos_agenda.AgendaContatos;
import contatos_agenda.Contato;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Ana Banana", 32392993);
        Contato contato2 = new Contato("Maria", 982432993);
        Contato contato3 = new Contato("Betina", 981532799);
        Contato contato4 = new Contato("Mário Armareiro", 31386996);
        Contato contato5 = new Contato("Pizzaria do Steve", 30301298);
        Contato contato6 = new Contato("emergência", 190);

        AgendaContatos agendaContatos = new AgendaContatos(contato, contato2, contato3, contato4, contato5, contato6);

        agendaContatos.adicionarContato("Menor Fujão", 988223157);
        agendaContatos.removerContato("emergência");

        agendaContatos.exibirContatos();
        System.out.println("############## - Pesquisa - #######################");
        System.out.println("Número: " + agendaContatos.pesquisarPorNome("Ana Banana"));
    }
}
