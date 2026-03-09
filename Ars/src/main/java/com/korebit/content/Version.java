package com.korebit.content;

/**
 * Represents a version of content in the Korebit system.
 * This class can be extended to include versioning details such as version number,
 * release date, and other metadata relevant to content versions.
 * This is an example of a singleton class that can be used to manage content versions
 */
public class Version {

    private final int versionNumber;
    private final int major;
    private final int minor;

    private static Version instance;

    private Version() {
        this.versionNumber = 1; // Default version number
        this.major = 1; // Default major version
        this.minor = 0; // Default minor version
    }

    public static synchronized Version getInstance() {
        if (instance == null) {
            instance = new Version();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Version is a singleton and cannot be cloned.");
    }
}
