package org.dominokit.domino.ui.utils;

public interface Selectable<T> {
    T select();
    T deselect();
    boolean isSelected();
}
