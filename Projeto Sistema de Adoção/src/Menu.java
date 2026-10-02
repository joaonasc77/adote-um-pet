import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<Animal> animais = new ArrayList<>();
    private final ArrayList<Adotante> adotantes = new ArrayList<>();

    public void executar() {

        boolean executando = true;

        while (executando) {

            System.out.println();
            System.out.println("----- SISTEMA DE ADOÇÃO -----");
            System.out.println();
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Animais");
            System.out.println("3 - Buscar Animal");
            System.out.println("4 - Realizar adoção");
            System.out.println("5 - Listar animais disponíveis");
            System.out.println("6 - Listar animais adotados");
            System.out.println("7 - Cadastrar Adotante");
            System.out.println("8 - Listar Adotantes");
            System.out.println("0 - Sair");

            System.out.println();
            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                //A sintaxe com -> (arrow) foi introduzida no Java 14,
                //como parte da evolução do switch. Ela permite escrever os cases. Associa diretamente cada case à instrução que deve ser executada
                //de forma mais enxuta e elimina a necessidade do break.

                case 1 -> cadastrarAnimal();

                case 2 -> listarAnimal();

                case 3 -> buscarAnimal();

                case 4 -> adotarAnimal();

                case 5 -> disponiveis();    //pets disponíveis para adoção

                case 6 -> adotados();       //pets adotados

                case 7 -> cadastrarAdotantes();

                case 8 -> listarAdotantes();

                case 0 -> {
                    executando = false;
                    System.out.println();
                    System.out.println("Encerrando o sistema...");
                    System.out.println();
                }

                default -> System.out.println("Opção Inválida!");
            }
        }
    }

    //Os métodos são privados, porque são usados apenas internamente pela classe Menu
    //Outras classes não precisam acessá-los diretamente
    private void cadastrarAnimal() {

        sc.nextLine();

        System.out.println();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Cor: ");
        String cor = sc.nextLine();

        System.out.print("Raça: ");
        String raca = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        Animal novoAnimal = new Animal(nome, cor, raca, idade, sexo, false);
        animais.add(novoAnimal);

        System.out.println();
        System.out.println("Pet cadastrado com sucesso!");
    }

    private void listarAnimal() {
        System.out.println();
        System.out.println("Lista de animais:");
        System.out.println();
        for (Animal animal : animais) { // 1º Animal = é o tipo, 2º animal = é a variável que representa o elemento
                                        // atual da lista e animais = é a ArrayList

            System.out.println();
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Cor: " + animal.getCor());
            System.out.println("Raça: " + animal.getRaca());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Sexo: " + animal.getSexo());

            System.out.println("-------------------------");
        }
    }

    private void buscarAnimal() {
        sc.nextLine(); // Limpa o ENTER deixado pelo nextInt() do menu

        System.out.println();
        System.out.print("Digite o nome do animal: ");
        String nomePesquisado = sc.nextLine();
        boolean encontrado = false;

        for (Animal animal : animais) {
            if (nomePesquisado.equalsIgnoreCase(animal.getNome())) { // equalsIgnoreCase = Compara dois textos sem
                                                                     // diferenciar maiúsculas de minúsculas
                System.out.println();
                System.out.println("Animal encontrado!");
                System.out.println();
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Cor: " + animal.getCor());
                System.out.println("Raça: " + animal.getRaca());
                System.out.println("Idade: " + animal.getIdade());
                System.out.println("Sexo: " + animal.getSexo());
                System.out.println("Adotado: " + animal.isAdotado());

                encontrado = true;

            }
        }

        if (!encontrado) {
            System.out.println();
            System.out.println("Animal não encontrado!");
        }
    }

    private void adotarAnimal() {
        sc.nextLine(); // Limpa o ENTER deixado pelo nextInt() do menu

        System.out.println();
        System.out.print("Digite o nome do animal a ser adotado: ");
        String nomeAnimal = sc.nextLine();

        boolean petEncontrado = false;

        for (Animal animal : animais) {

            if (nomeAnimal.equalsIgnoreCase(animal.getNome())) { // compara o nome digitado com o nome de cada animal da
                                                                 // lista

                petEncontrado = true;

                if (!animal.isAdotado()) { // o animal não está adotado?

                    System.out.print("Confirmar adoção? (s/n): ");
                    char letra = sc.next().charAt(0);

                    if (letra == 's') {
                        animal.setAdotado(true);
                        System.out.println();
                        System.out.println("Animal adotado com sucesso!");
                    } else {
                        System.out.println();
                        System.out.println("Adoção cancelada!");
                    }

                } else {
                    System.out.println();
                    System.out.println("Pet já adotado!");
                }

                break;
            }
        }

        if (!petEncontrado) {
            System.out.println();
            System.out.println("Pet não cadastrado!");
        }
    }

    private void disponiveis() {
        sc.nextLine();

        System.out.println();
        System.out.println("Pets disponíveis para adoção:");

        for (Animal animal : animais) {
            if (!animal.isAdotado()) {
                System.out.println(animal.getNome());
            }
        }
    }

    private void adotados() {
        System.out.println();
        System.out.println("Pets adotados:");

        for (Animal animal : animais) {
            if (animal.isAdotado()) {
                System.out.println(animal.getNome());
            }
        }
    }

    private void cadastrarAdotantes() {
        sc.nextLine();

        System.out.println();
        System.out.print("Nome: ");
        String nomeAdotante = sc.nextLine();

        System.out.print("Contato: ");
        String contato = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        Adotante novoAdotante = new Adotante(nomeAdotante, contato, email);
        adotantes.add(novoAdotante);

        System.out.println();
        System.out.println("Adotante cadastrado com sucesso!");
    }

    private void listarAdotantes() {

        System.out.println();
        System.out.println("Lista de adotantes:");
        System.out.println();

        for (Adotante adotante : adotantes) {
            System.out.println("Nome: " + adotante.getNome());
            System.out.println("Contato: " + adotante.getContato());
            System.out.println("E-mail: " + adotante.getEmail());
            System.out.println("-------------------------");
        }
    }
}
