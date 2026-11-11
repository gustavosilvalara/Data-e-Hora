package br.com.alura.dataehoraatual;

import java.time.LocalDateTime;

public class DateEHoraAtual {
    static void main() {
        String enviar = "Enviar relátorio semanal";
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Tarefa: \"" + enviar + "\"");
        System.out.println("Data atual: " + localDateTime.toLocalDate());
        System.out.println("Hora atual: " + localDateTime.toLocalTime());
    }
}
