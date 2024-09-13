import br.com.mfraga.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setName("Marcos");
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa1.falar("tudo bem?"));
    }
}