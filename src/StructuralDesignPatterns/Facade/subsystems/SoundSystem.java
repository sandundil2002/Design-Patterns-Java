package StructuralDesignPatterns.Facade.subsystems;

public interface SoundSystem extends PowerSystem {
    void setVolume(int volume);
}