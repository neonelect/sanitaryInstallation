package main.bean.base;

import main.enums.Unit;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Width object - if different units are used, units must be enclosed with value.
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public class Width {

    private double width;
    private Unit unit;

    private Width() {
    }

    public Width(double width, Unit unit) {
        this.width = width;
        this.unit = unit;
    }

    public double getWidth() {
        return width;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        Width other = (Width) o;
        return new EqualsBuilder()
                .append(this.width, other.getWidth())
                .append(this.unit, other.getUnit())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.width)
                .append(this.unit)
                .hashCode();
    }
}
