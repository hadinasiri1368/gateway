package org.gateway.dto;

import lombok.*;
import org.gateway.model.Person;
import org.gateway.model.User;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserPersonDto {
    private User user;
    private Person person;
}
