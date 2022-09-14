package tarefa1.Modelos;

import java.util.Objects;

public class Professor extends Pessoa{

    private int registro;

    public Professor(){

    }
    public Professor(int registro){
        this.registro = registro;
    }

    public int getRegistro() {
        return this.registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Professor registro(int registro) {
        setRegistro(registro);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Professor)) {
            return false;
        }
        Professor professor = (Professor) o;
        return registro == professor.registro;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registro);
    }

    @Override
    public String toString() {
        return "{" +
            " registro='" + getRegistro() + "'" +
            "}";
    }

}
