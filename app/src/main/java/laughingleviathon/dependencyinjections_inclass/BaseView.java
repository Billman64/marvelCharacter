package laughingleviathon.dependencyinjections_inclass;

/**
 * The BaseView defines the abstract methods that every View in the app should implement
 */

public interface BaseView<T> {
    void setPresent(T presenter);
}
