package LocalExtention;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DataEstendida {
    private LocalDate data; // cria um atributo para conseguir chamar

    // Adiciona um constructor e um getter para adicionar a data somente na criação e pegar em todos os lugares
    public DataEstendida(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return this.data;
    }

    // Cria métodos para estender a biblioteca
    public String formatarPadraoBrasileiro() {
        return this.data.getDayOfMonth() + "/"
             + this.data.getMonthValue() + "/"
             + this.data.getYear();
    }

    public boolean isFinalDeSemana() {
        if (this.data.getDayOfWeek() == DayOfWeek.SATURDAY
         || this.data.getDayOfWeek() == DayOfWeek.SUNDAY)
            return true;
        return false;
    }
}
