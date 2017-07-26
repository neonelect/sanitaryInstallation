package main.bean.base;

import main.enums.Unit;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Height object - if different units are used, units must be enclosed with value.
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public class Height {

    private double height;
    private Unit unit;

    private Height() {
    }

    public Height(double height, Unit unit) {
        this.height = height;
        this.unit = unit;
    }

    public double getHeight() {
        return height;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        Height other = (Height) o;
        return new EqualsBuilder()
                .append(this.height, other.getHeight())
                .append(this.unit, other.getUnit())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.height)
                .append(this.unit)
                .hashCode();
    }
}
