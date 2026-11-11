# Manipulação de Data e Hora em Java 📅⏰

Repositório dedicado ao estudo e à prática da **API de Data e Hora do Java (`java.time`)**, contendo exercícios e códigos desenvolvidos com base nos treinamentos da Alura. O objetivo é dominar a manipulação moderna de datas, horários, fusos horários e cálculos temporais de forma segura e eficiente.

---

## 🚀 Tópicos e Conceitos Abordados

Neste repositório foram explorados os principais recursos da API moderna de datas introduzida no Java 8+:

*   **Classes Principais (`LocalDate`, `LocalTime`, `LocalDateTime`):** Representação isolada ou combinada de datas e horários sem fuso horário.
*   **Manipulação e Ajustes:** Adição e subtração de períodos/duração utilizando métodos como `plusHours`, `plusDays`, entre outros.
*   **Cálculos de Diferença Temporais (`Duration` e `Period`):** Mensuração do tempo decorrido entre datas ou horários específicos para fins de cálculo de jornadas ou prazos.
*   **Fuso Horário (`ZonedDateTime` e `ZoneId`):** Gerenciamento e conversão de horários considerando diferentes regiões geográficas globais.
*   **Formatação e Parsing:** Exibição e leitura de textos formatados em datas/horas padronizadas.

---

## 📂 Exercícios e Módulos Desenvolvidos

Abaixo está a lista dos pacotes e funcionalidades presentes na pasta `src/br/com/alura/`:

*   **`ajustandodatavencimento`:** Lógica para recalcular ou ajustar datas de vencimento de boletos/contas.
*   **`calculandodatadeentrega`:** Simulação e previsão de prazos e datas de entrega com base em dias úteis ou corridos.
*   **`controleexpediente`:** Controle de jornada de trabalho, calculando horários de saída previstos com base na carga horária e balanço de saldo de horas positivas ou negativas (`Duration`).
*   **`convertendohorario`:** Conversão de instâncias e fusos horários entre diferentes regiões.
*   **`dataehoraatual`:** Captura e exibição da data e hora correntes do sistema.
*   **`diferencaentrehoras`:** Cálculo de intervalos exatos entre horários distintos.
*   **`formatandodataehora`:** Aplicação de padrões customizados de formatação textual para exibição de datas e horas.
*   **`fusohorario`:** Configuração e manipulação de zonas horárias globais (`ZoneId`).
*   **`lembretepagamento`:** Automação e verificação de alertas baseados em datas futuras.
*   **`VerificandoData`:** Validações lógicas envolvendo comparações temporais (antes, depois ou igualdade).

---

## 🛠️ Tecnologias Utilizadas

*   **Java** (JDK 17 ou superior - API `java.time`).
*   **IDE:** IntelliJ IDEA.
*   **Git e GitHub** para controle de versão.

---

## 💡 Como Executar os Códigos

1. Clone o repositório para a sua máquina local:
   ```bash
   git clone [https://github.com/gustavosilvalara/data-e-hora.git](https://github.com/gustavosilvalara/data-e-hora.git)

2. Abra o projeto no IntelliJ IDEA (ou na sua IDE Java favorita)
3. Navegue até o pacote desejado dentro de src/br/com/alura/ (ex: br.com.alura.controleexpediente.ControleExpediente)
4. Execute o método main para testar as operações temporais no console
