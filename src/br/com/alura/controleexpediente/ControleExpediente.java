package br.com.alura.controleexpediente;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        int cargaHoraria;
        LocalTime entradaHorario;
        LocalTime saidaHorario;
        LocalTime saidaPrevista;

        System.out.print("Digite o horário de entrada (HH:mm): ");
        entradaHorario = LocalTime.parse(entrada.next(), formato);

        System.out.print("Digite a carga horária diária (em horas): ");
        cargaHoraria = entrada.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        saidaHorario = LocalTime.parse(entrada2.nextLine(), formato);

        entrada.close();
        entrada2.close();

        saidaPrevista = entradaHorario.plusHours(cargaHoraria);

        Duration duracao = Duration.between(saidaPrevista, saidaHorario);
        long saldoHoras = duracao.toHours();
        long saldoMinutos = duracao.toMinutesPart();

        System.out.println();
        System.out.println("Horário de entrada: " + entradaHorario);
        System.out.println("Horário de saída previsto: " + saidaPrevista);
        System.out.println("Horário real de saída: " + saidaHorario);
        System.out.println("Saldo de horas: " + saldoHoras + "h " +  saldoMinutos  + "min");



    }
}
