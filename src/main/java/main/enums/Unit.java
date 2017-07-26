package main.enums;

/**
 * Created by neonelect <neonelect91@gmail.com>
 */
public enum Unit {

    METER("[m]", "Metr"),
    SQUARE_METER("[m2]", "Metr kw."),
    QUBIC_METER("[m3]", "Metr szesc."),
    QUBIC_DECIMETER("[dm3]", "Decymetr szesc."),
    WATT("[W]", "Wat"),
    KILO_WATT("[kW]", "Kilo Wat"),
    KILO_WATT_HOUR("[kWh]", "Kilowatogodzina")
    ;

    private String label;
    private String description;

    Unit(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }
}
