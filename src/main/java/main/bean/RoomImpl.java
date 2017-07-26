package main.bean;

import main.bean.base.Volume;

import java.util.ArrayList;
import java.util.List;

/**
 * RoomImpl object. Gathers beans with dimensions
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public class RoomImpl<T extends Volume> implements Room<T>{

    private List<T> elements;
    private double overallVolume;

    public RoomImpl() {
        this.elements = new ArrayList<>();
        this.overallVolume = 0.0;
    }

    public List<T> getElements() {
        return this.elements;
    }

    public T getElementByVolume(T volume) {
        return this.elements
                .stream().filter(
                        element -> element.equals(volume))
                .findFirst()
                .get();
    }

    public double getOverallVolume() {
        return 0;
    }

    public T getElementByName(String name) {
        return null;
    }

    public double getElementVolume(String name) {
        return 0;
    }

    public List<String> getAllElementsNames() {
        return null;
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
        recalculateOverallVolume(Operation.ADD, element);
    }

    @Override
    public void remove(T element) {
        this.elements.remove(element);
        recalculateOverallVolume(Operation.REMOVE, element);
    }

    @Override
    public void update(T element) {
        //Design approach
        throw new UnsupportedOperationException();
    }

    private void recalculateOverallVolume(Operation operation, T bean){
        switch(operation){
            case ADD:{
                this.elements.stream()
                        .forEach((element) -> this.overallVolume+=element.getVolume());
                break;
            }
            case REMOVE:{
                this.overallVolume-=bean.getVolume();
                break;
            }
            case UPDATE:{
                this.overallVolume+=bean.getVolume();
                break;
            }
        }
    }

    private enum Operation {
        ADD, REMOVE, UPDATE;
    }
}
