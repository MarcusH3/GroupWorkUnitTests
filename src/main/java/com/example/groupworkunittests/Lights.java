package com.example.groupworkunittests;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
public class Lights {

    private final String halfLight;
    private final String fullLight;
    private final String rearLight;

    @Setter
    private boolean lightsOn;

    @Setter
    private boolean warningLightOn;




}
