package main.bean.base;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Volume bean.
 * <p>
 * Created by neonelect <neonelect91@gmail.com>
 */
public class Volume {

    private Height height;
    private Width width;
    private Depth depth;

    private double volume;

    private Volume() {
    }

    public Volume(Volume volume) {
        this(volume.getHeight(), volume.getWidth(), volume.getDepth());
    }

    public Volume(Height height, Width width, Depth depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.volume = this.height.getHeight() * this.width.getWidth() * this.depth.getDepth();
    }

    public Height getHeight() {
        return height;
    }

    public Width getWidth() {
        return width;
    }

    public Depth getDepth() {
        return depth;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        Volume other = (Volume) o;
        return new EqualsBuilder()
                .append(this.height, other.getHeight())
                .append(this.width, other.getWidth())
                .append(this.depth, other.getDepth())
                .append(this.volume, other.getVolume())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.height)
                .append(this.width)
                .append(this.depth)
                .append(this.volume)
                .hashCode();
    }
}
