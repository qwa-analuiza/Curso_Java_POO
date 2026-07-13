package sessao11.exe01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter  fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate dataUm = LocalDate.now();
        System.out.println(dataUm ); // somente data local

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02); // hora + data na hora da máquina local

        Instant d03 = Instant.now();
        System.out.println(d03); // gera com o horario de londres data+ hora

        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println(d05);

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println(d06);


        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        System.out.println(d07);

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);// uso a classe para formatar com o padrão dia mes ano
        System.out.println(d08);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:09", fmt2);
        System.out.println(d09);

        LocalDate d10 =  LocalDate.of(2022, 7, 20);
        System.out.println(d10); // instancia data formatada

        LocalDateTime d11 =  LocalDateTime.of(2022, 7, 20, 1, 39);
        System.out.println(d11); // formatar dia mes, ano, minutos, horas formatada

    }
}
