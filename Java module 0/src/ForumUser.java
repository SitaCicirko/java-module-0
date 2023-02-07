
import java.lang. *;
public class ForumUser extends User {

    public ForumUser(String imie, String nazwisko, int wiek, String plec, String email) {
        super(imie, nazwisko, wiek, plec, email);
    }

        boolean logowanie = true;
        boolean rejestracja = false;

        public void Logowanie(){
            if(logowanie == true){
                System.out.println("Zalogowano");
            }
            else{
                System.out.println("Nie zalogowano");
            }
        }
        public void Rejestracja(){
            if(rejestracja == true){
                System.out.println("Zarejestrowano");
            }
            else{
                System.out.println("Nie zarejestrowano");
            }
        }
        public void OpublikujPost(){
            System.out.println("Opublikowano post");
        }
        public void UsunPost(){
            System.out.println("Usunieto post");
        }
        public void Wyswietl(){
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek + " Plec: " + plec + " Email: " + email);
    }
        public void Komentuj(){
            System.out.println("Skomentowano post");
        }

}
