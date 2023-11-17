import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введіть дані для держави:");
        System.out.print("Назва: ");
        String name = scanner.nextLine();
        System.out.print("Населення: ");
        int population = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.print("Столиця: ");
        String capital = scanner.nextLine();

        State state = new State(name, population, capital);

        System.out.println("\nВведіть дані для республіки:");
        System.out.print("Назва: ");
        name = scanner.nextLine();
        System.out.print("Населення: ");
        population = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Столиця: ");
        capital = scanner.nextLine();
        System.out.print("Президент: ");
        String president = scanner.nextLine();

        Republic republic = new Republic(name, population, capital, president);

        System.out.println("\nВведіть дані для монархії:");
        System.out.print("Назва: ");
        name = scanner.nextLine();
        System.out.print("Населення: ");
        population = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Столиця: ");
        capital = scanner.nextLine();
        System.out.print("Монарх: ");
        String monarch = scanner.nextLine();

        Monarchy monarchy = new Monarchy(name, population, capital, monarch);

        System.out.println("\nВведіть дані для королівства:");
        System.out.print("Назва: ");
        name = scanner.nextLine();
        System.out.print("Населення: ");
        population = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Столиця: ");
        capital = scanner.nextLine();
        System.out.print("Король: ");
        String king = scanner.nextLine();

        Kingdom kingdom = new Kingdom(name, population, capital, king);

        scanner.close();

        state.Show();
        System.out.println("\n");
        republic.Show();
        System.out.println("\n");
        monarchy.Show();
        System.out.println("\n");
        kingdom.Show();
    }

    public static class State {
        private String name;
        private int population;
        private String capital;

        public State(String name, int population, String capital) {
            this.name = name;
            this.population = population;
            this.capital = capital;
        }

        public void Show() {
            System.out.println("Назва держави: " + name);
            System.out.println("Населення: " + population);
            System.out.println("Столиця: " + capital);
        }
    }

    public static class Republic {
        private String name;
        private int population;
        private String capital;
        private String president;

        public Republic(String name, int population, String capital, String president) {
            this.name = name;
            this.population = population;
            this.capital = capital;
            this.president = president;
        }

        public void Show() {
            System.out.println("Назва держави: " + name);
            System.out.println("Населення: " + population);
            System.out.println("Столиця: " + capital);
            System.out.println("Президент: " + president);
        }
    }

    public static class Monarchy {
        private String name;
        private int population;
        private String capital;
        private String monarch;

        public Monarchy(String name, int population, String capital, String monarch) {
            this.name = name;
            this.population = population;
            this.capital = capital;
            this.monarch = monarch;
        }

        public void Show() {
            System.out.println("Назва держави: " + name);
            System.out.println("Населення: " + population);
            System.out.println("Столиця: " + capital);
            System.out.println("Монарх: " + monarch);
        }
    }

    public static class Kingdom {
        private String name;
        private int population;
        private String capital;
        private String king;

        public Kingdom(String name, int population, String capital, String king) {
            this.name = name;
            this.population = population;
            this.capital = capital;
            this.king = king;
        }

        public void Show() {
            System.out.println("Назва держави: " + name);
            System.out.println("Населення: " + population);
            System.out.println("Столиця: " + capital);
            System.out.println("Король: " + king);
        }
    }
}