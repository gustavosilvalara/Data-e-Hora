package br.com.alura.lembretepagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    static void main() {
        LocalDate data = LocalDate.of(2025, 3, 30);
        int prazoLembrete = 5;
        LocalDate lembretePagamento = data.minusDays(prazoLembrete);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String lembretePagamentoFormatado = lembretePagamento.format(formato);

        System.out.println("Data do lembrete: " + lembretePagamentoFormatado);

    }
}
