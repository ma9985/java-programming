package day14_multi_branch_if_statements;
/*
"Choose your language"
int selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk java and english, hello"
 */
public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int selection = 1;
        if (selection == 1) {
            System.out.println("Hello thank your for your call");
        } else if (selection == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (selection == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (selection ==5 ) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("Lets talk java and english, hello");
        }


        }
    }

