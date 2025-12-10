package main.java.com.shreya.analytics.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_events")
public class UserEvent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String eventType;
    private LocalDateTime timestamp;
    // getters and setters
}
