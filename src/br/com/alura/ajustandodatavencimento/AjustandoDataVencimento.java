package br.com.alura.ajustandodatavencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoDataVencimento {
    static void main() {
        LocalDate data = LocalDate.of(2025, 3, 20);
        int adiantamentoMeses = 1;
        LocalDate novaData = data.plusMonths(adiantamentoMeses);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String novaDataFormatado = novaData.format(formato);

        System.out.println("Nova data de vencimento: " + novaDataFormatado);
    }
}
