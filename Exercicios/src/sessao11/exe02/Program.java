package sessao11.exe02;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = " + d04.format(fmt1));// usamos como argumento a formatação realiozada acima e passamos como argumente a variável usada
        System.out.println("d04 = " + fmt1.format(d04)); // a mesma maneira, porém uma forma alternativa , para "dd/MM/yyyy"

        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));// imprime o horario de londres convertido para o horário local
        // se eu usar uma data que tem fuso para um sormat que não tem, não é possível

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("resultado01 = " + r1);

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("resultado02 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("resultado03 = " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("resultado04 = " + r4);

        System.out.println("");
            //para selecionar dia/mes/ ano da variável:
        System.out.println("dia do mês: " +d04.getDayOfMonth());
        System.out.println("dia da semana: " +d04.getDayOfWeek());
        System.out.println("mes: " +d04.getMonthValue());
        System.out.println("ano: " +d04.getYear());

        //para selecionar dia/mes/ano e também horários da variável:

        System.out.println("hora: " +d05.getHour());
        System.out.println("Minutos: " +d05.getMinute());
    }
}
