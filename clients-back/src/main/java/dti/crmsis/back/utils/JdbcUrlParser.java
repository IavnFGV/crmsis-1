package dti.crmsis.back.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JdbcUrlParser {

    private final String jdbcUrl;

    private String host;
    private String database;

    public JdbcUrlParser(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        parse();
    }

    private void parse() {
        Pattern pattern = Pattern.compile("jdbc:mysql://([^:/?#]+)(?::\\d+)?/([^?;]+)");
        Matcher matcher = pattern.matcher(jdbcUrl.toLowerCase());
        if (matcher.find()) {
            host = matcher.group(1);
            database = matcher.group(2);
        }
    }

    public String getHost() {
        return host;
    }

    public String getDatabase() {
        return database;
    }
}
