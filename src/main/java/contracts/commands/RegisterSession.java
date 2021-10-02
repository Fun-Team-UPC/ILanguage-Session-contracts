package contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDate;

@Value
public class RegisterSession {
    @TargetAggregateIdentifier
    String sessionId;
    LocalDate startAt;
    LocalDate endAt;
    String link;
    String state;
    String topic;
    String information;

}
