CREATE TABLE IF NOT EXISTS user_events (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id VARCHAR(255),
    event_type VARCHAR(255),
    timestamp DATETIME
);
CREATE INDEX IF NOT EXISTS idx_user_event ON user_events (user_id, event_type);
