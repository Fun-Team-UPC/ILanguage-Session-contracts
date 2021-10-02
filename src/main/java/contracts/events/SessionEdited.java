package contracts.events;

import lombok.Value;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class SessionEdited {
    String sessionId;
    LocalDate startAt;
    LocalDate endAt;
    String link;
    String state;
    String topic;
    String information;
    Instant occurredOn;
}
