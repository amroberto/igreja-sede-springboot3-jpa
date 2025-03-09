package com.igreja_sede.igreja_sede.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UnityType {
    PARISH("Parish"),
    COMMUNITY("Community"),
    PREACHING_POINT("Preaching Point");

    private final String displayName;

    UnityType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    @JsonValue
    public String getDisplayName() {
        return displayName;
    }

    @JsonCreator
    public static UnityType fromValue(String value) {
        for (UnityType type : UnityType.values()) {
            if (type.displayName.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid UnityType: " + value);
    }
}
