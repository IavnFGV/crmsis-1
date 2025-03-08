package dti.crmsis.back;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.inject.Singleton;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Singleton
public class JacksonConfig  implements ObjectMapperCustomizer {
    JavaTimeModule javaTimeModule = new JavaTimeModule();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void customize(ObjectMapper objectMapper) {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        javaTimeModule.addDeserializer(LocalDateTime.class, new com.fasterxml.jackson.databind.JsonDeserializer<>() {
            @Override
            public LocalDateTime deserialize(com.fasterxml.jackson.core.JsonParser parser,
                                             com.fasterxml.jackson.databind.DeserializationContext context)
                    throws IOException {
                return LocalDateTime.parse(parser.getText(), FORMATTER);
            }
        });
        objectMapper.registerModule(javaTimeModule);
        objectMapper.enable(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);
    }
}
