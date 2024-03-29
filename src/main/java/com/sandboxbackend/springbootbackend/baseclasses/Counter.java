package com.sandboxbackend.springbootbackend.baseclasses;


import java.util.UUID;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Counter {

    @Id
    @GeneratedValue(generator = "uuid")
    UUID id;
    int counterValue = 0;
}
