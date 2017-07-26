package main.bean.base;

import main.enums.Unit;

/**
 * Base object value paired with unit.
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public class ValueWithUnit<T> {

    private T value;
    private Unit unit;

    public ValueWithUnit(T value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public T getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }
}
