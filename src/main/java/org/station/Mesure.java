package org.station;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Mesure {
    private float temperature;
    private float humidite;
    private float pression;
}
