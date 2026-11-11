package br.com.alura.diferencaentrehoras;

import java.time.Duration;
import java.time.LocalTime;

public class DiferancaHoras {
    static void main() {
        LocalTime inicio = LocalTime.of(14,30);
        LocalTime fim = LocalTime.of(16,45);

        Duration duration = Duration.between(inicio, fim);
        System.out.println("Diferença de tempo: " + duration.toHours() + " horas e "
                            + duration.toMinutesPart() + " minutos");

    }
}
