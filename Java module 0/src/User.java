public class User {
    String imie;
    String nazwisko;
    int wiek;
    String plec;
    String email;

    public User(String imie, String nazwisko, int wiek, String plec, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.email = email;
    }
    public void Logowanie(){}
    public void Rejestracja(){}
    public void UsunKonto(){}
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public String getPlec() {
        return plec;
    }
    public void setPlec(String plec) {
        this.plec = plec;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
