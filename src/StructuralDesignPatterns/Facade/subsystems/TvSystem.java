package StructuralDesignPatterns.Facade.subsystems;

public interface TvSystem extends PowerSystem {
    void setChannel(int channel);
}