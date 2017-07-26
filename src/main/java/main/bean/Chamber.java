package main.bean;

import main.bean.base.Depth;
import main.bean.base.Height;
import main.bean.base.Volume;
import main.bean.base.Width;

/**
 * Chamber bean. Has dimension, volume and chamber name.
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public class Chamber extends Volume {

    private String chamberName;

    public Chamber(String chamberName, Volume volume) {
        super(volume);
        this.chamberName = chamberName;
    }

    public String getChamberName() {
        return chamberName;
    }
}
