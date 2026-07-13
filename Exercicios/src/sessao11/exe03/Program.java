package sessao11.exe03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaAnteriorLocalDate = d04.minusDays(7); // menos sete dias bda data instanciada na var d04
        LocalDate proximaSemanaLocalDate = d04.plusDays(7); //mais sete dias da data instanciada na var d5

        System.out.println("Semana anterior d04 = "+ semanaAnteriorLocalDate);
        System.out.println("Próxima semana d04 = "+ proximaSemanaLocalDate);

        LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d05.plusDays(7);

        System.out.println("Semana anterior d04 = "+ semanaAnteriorLocalDateTime);
        System.out.println("Próxima semana d04 = "+ proximaSemanaLocalDateTime);

        Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("Semana anterior d04 = "+ semanaAnteriorInstant);
        System.out.println("Próxima semana d04 = "+ proximaSemanaInstant);

        System.out.println();
        System.out.println("Duração");

        Duration t1 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d04.atStartOfDay());// .atStartOfDay() cnverte de local date para localDateTime
        System.out.println("t1 dias = " + t1.toDays());

        Duration t2 = Duration.between(semanaAnteriorLocalDateTime, d05);
        System.out.println("t2 dias = " + t2.toDays());
    }
}