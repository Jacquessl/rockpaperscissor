import java.util.concurrent.TimeUnit;
public class Program{
    public static void main(String[] args) throws Exception {
        System.out.println(
                        "$$\\   $$\\ $$$$$$$$\\ $$\\       $$\\       $$$$$$\\    \n" +
                        "$$ |  $$ |$$  _____|$$ |      $$ |     $$  __$$\\   \n" +
                        "$$ |  $$ |$$ |      $$ |      $$ |     $$ /  $$ |  \n" +
                        "$$$$$$$$ |$$$$$\\    $$ |      $$ |     $$ |  $$ |  \n" +
                        "$$  __$$ |$$  __|   $$ |      $$ |     $$ |  $$ |  \n" +
                        "$$ |  $$ |$$ |      $$ |      $$ |     $$ |  $$ |  \n" +
                        "$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\ $$$$$$$$\\ $$$$$$  |  \n" +
                        "\\__|  \\__|\\________|\\________|\\________|\\______/  ");
        System.out.println("Welcome to Rock Paper Scissor");

        System.out.println("Avaliable languages: English/Polish");
        System.out.print("Choose language by typing: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String lang = scanner.nextLine();
        lang = lang.toUpperCase();
        int langarray = 0;
        int pa = 1;
        int i = 1;

        if (lang.equals("POLISH")) {
            langarray = 0;
        } else if (lang.equals("ENGLISH")) {
            langarray = 1;
        } else {
            System.out.println("Undefined language");
            return;
        }
        while(pa == 1){
            String[] pick = {"1 - Kamien\n2 - Papier\n3 - Nozyce\nWpisz liczbe, aby wybrac: ", "1 - Rock\n2 - Paper\n3 - Scissor\nTo pick, type number: "};
            System.out.println(pick[langarray]);
            int p = scanner.nextInt();
            if (p > 3 && p < 1) {
                System.out.println("You picked, a wrong number");
            } else {
                String[][] picked = {
                        {"Kamien", "Rock"},
                        {"Papier", "Paper"},
                        {"Nozyce", "Scissor"}
                };
                double dpick = Math.random() * 3;
                int cpick = (int) dpick;


                System.out.println("-------------------------------------------------------------------------------------------\n" +
                        "    _______                                                                     _______    \n" +
                        "---'   ____)                                                                   (____   '---\n" +
                        "      (_____)                                                                 (_____)      \n" +
                        "      (_____)                                                                 (_____)      \n" +
                        "      (____)                                                                   (____)      \n" +
                        "---.__(___)                                                                     (___)__.---\n" +
                        "                                       " + picked[0][langarray]);
                TimeUnit.MILLISECONDS.sleep(600);
                System.out.println("-------------------------------------------------------------------------------------------\n" +
                        "    _______                                                                     _______    \n" +
                        "---'   ____)____                                                           ____(____   '---\n" +
                        "          ______)                                                         (______          \n" +
                        "          _______)                                                       (_______          \n" +
                        "         _______)                                                         (_______         \n" +
                        "---.__________)                                                             (__________.---\n" +
                        "                                       " + picked[1][langarray]);
                TimeUnit.MILLISECONDS.sleep(600);
                System.out.println("-------------------------------------------------------------------------------------------\n" +
                        "    _______                                                                     _______    \n" +
                        "---'   ____)____                                                           ____(____   '---\n" +
                        "          ______)                                                         (______          \n" +
                        "       __________)                                                       (__________       \n" +
                        "      (____)                                                                   (____)      \n" +
                        "---.__(___)                                                                     (___)__.---\n" +
                        "                                       " + picked[2][langarray] +
                        "\n-------------------------------------------------------------------------------------------");
                TimeUnit.MILLISECONDS.sleep(600);
                String[] pers = {"Ty ", "You"};
                String[] ene = {"Komputer", "Computer"};
                String[] resw = {"Wygrywasz! " + picked[p - 1][0] + " bije " + picked[cpick][0], "You win! " + picked[p - 1][1] + " beats " + picked[cpick][1]};
                String[] resl = {"Przegrywasz, " + picked[cpick][0] + " bije " + picked[p - 1][0], "You lose, " + picked[cpick][1] + " beats " + picked[p - 1][1]};
                String[] resd = {"      Remis", "       Draw"};
                if (p == 1 && cpick == 0) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)                                                                   (____   '---\n" +
                            "      (_____)                                                                 (_____)      \n" +
                            "      (_____)                                                                 (_____)      \n" +
                            "      (____)                                                                   (____)      \n" +
                            "---.__(___)                                                                     (___)__.---\n" +
                            "                                 " + resd[langarray]);
                } else if (p == 2 && cpick == 1) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)____                                                           ____(____   '---\n" +
                            "          ______)                                                         (______          \n" +
                            "          _______)                                                       (_______          \n" +
                            "         _______)                                                         (_______         \n" +
                            "---.__________)                                                             (__________.---\n" +
                            "                                 " + resd[langarray]);
                } else if (p == 3 && cpick == 2) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)____                                                           ____(____   '---\n" +
                            "          ______)                                                         (______          \n" +
                            "       __________)                                                       (__________       \n" +
                            "      (____)                                                                   (____)      \n" +
                            "---.__(___)                                                                     (___)__.---\n" +
                            "                                 " + resd[langarray]);
                } else if (p == 1 && cpick == 1) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)                                                               ____(____   '---\n" +
                            "      (_____)                                                             (______          \n" +
                            "      (_____)                                                            (_______          \n" +
                            "      (____)                                                              (_______         \n" +
                            "---.__(___)                                                                 (__________.---\n" +
                            "                                 " + resl[langarray]);
                } else if (p == 1 && cpick == 2) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)                                                               ____(____   '---\n" +
                            "      (_____)                                                             (______          \n" +
                            "      (_____)                                                            (__________       \n" +
                            "      (____)                                                                   (____)      \n" +
                            "---.__(___)                                                                     (___)__.---\n" +
                            "                                 " + resw[langarray]);
                } else if (p == 2 && cpick == 0) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)____                                                               (____   '---\n" +
                            "          ______)                                                             (_____)      \n" +
                            "          _______)                                                            (_____)      \n" +
                            "         _______)                                                              (____)      \n" +
                            "---.__________)                                                                 (___)__.---\n" +
                            "                                 " + resw[langarray]);
                } else if (p == 3 && cpick == 0) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)____                                                               (____   '---\n" +
                            "          ______)                                                             (_____)      \n" +
                            "       __________)                                                            (_____)      \n" +
                            "      (____)                                                                   (____)      \n" +
                            "---.__(___)                                                                     (___)__.---\n" +
                            "                                 " + resl[langarray]);
                } else if (p == 2 && cpick == 2) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)____                                                           ____(____   '---\n" +
                            "          ______)                                                         (______          \n" +
                            "          _______)                                                       (__________       \n" +
                            "         _______)                                                              (____)      \n" +
                            "---.__________)                                                                 (___)__.---\n" +
                            "                                 " + resl[langarray]);
                } else if (p == 3 && cpick == 1) {
                    System.out.println(" " + pers[langarray] + "                                                                              " + ene[langarray] + '\n' +
                            "    _______                                                                     _______    \n" +
                            "---'   ____)____                                                           ____(____   '---\n" +
                            "          ______)                                                         (______          \n" +
                            "       __________)                                                       (_______          \n" +
                            "      (____)                                                              (_______         \n" +
                            "---.__(___)                                                                 (__________.---\n" +
                            "                                 " + resw[langarray]);
                }
                String[] wtpa = {"Wpisz dowolny znak, aby zagrac ponownie, aby wyjsc, wcisnij q: ", "Type any letter to play again, to quit, press q: "};
                System.out.println(wtpa[langarray]);
                char ttpa = scanner.next().charAt(0);
                if (ttpa=='q') {
                    String[] gb = {"Ilosc zagranych gier: " + i + ", do zobaczenia pozniej!", "Number of games: " + i + ", see you later!"};
                    System.out.println(gb[langarray]);
                    pa = 0;
                }
                i++;
            }
        }
    }
    public static void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }
}