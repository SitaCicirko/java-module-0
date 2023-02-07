public class Aplication {
    public static void main(String[] args) {
        ForumUser User = new ForumUser("Jan", "Kowalski", 20, "M", "srututu@gmail.com");
        User.Logowanie();
        User.Rejestracja();
        User.OpublikujPost();
        User.UsunPost();
        User.Komentuj();
        User.Wyswietl();
        
    }
}