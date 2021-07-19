
package Modelo;


public class Cliente {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public String getEs() {
        return Es;
    }

    public void setES(String Es) {
        this.Es = Es;
    }

    public Cliente() {
    }
    int id;
    String Dni;
    String Nom;
    String Dir;
    String Es;
}
