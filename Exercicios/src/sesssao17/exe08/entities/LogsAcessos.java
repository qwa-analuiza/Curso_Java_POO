package sesssao17.exe08.entities;

import java.util.Date;
import java.util.Objects;

public class LogsAcessos implements Comparable<LogsAcessos>{
    private String name;
    private Date moment  ;

    public LogsAcessos(Date moment, String name) {
        this.moment = moment;
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setDate(Date moment) {
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogsAcessos that = (LogsAcessos) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(LogsAcessos other) {
        return this.name.compareTo(other.getName());
    }
}
