package web.sandbox.model;

import java.time.ZoneId;
import java.util.UUID;

public class BaseModel {
    private UUID uuid_id;
    private ZoneId timeZone;

    public UUID getUuid_id() {
        return this.uuid_id;
    }

    public void setUuid_id(UUID uuid_id) {
        this.uuid_id = uuid_id;
    }

    public ZoneId getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(ZoneId timeZone) {
        this.timeZone = timeZone;
    }
}
