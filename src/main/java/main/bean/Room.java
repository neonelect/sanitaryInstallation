package main.bean;

import main.bean.base.Volume;

import java.util.List;

/**
 * Room interface.
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public interface Room<T extends Volume> {

    List<T> getElements();
    T getElementByVolume(T volume);
    double getOverallVolume();

    T getElementByName(String name);
    double getElementVolume(String name);

    List<String> getAllElementsNames();

    void add(T element);
    void remove(T element);
    void update(T element);
}
