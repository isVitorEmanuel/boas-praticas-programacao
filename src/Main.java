import io.Menu;

public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        banco.popularBancos();

        int opcaoMenu = 0;

        while (opcaoMenu != Menu.OPCAO_SAIDA){
            Menu.exibirMenu();
            opcaoMenu = Menu.lerOpcaoMenu();
            OperacoesMenu.executarOperacao(opcaoMenu);
        }
    }
}