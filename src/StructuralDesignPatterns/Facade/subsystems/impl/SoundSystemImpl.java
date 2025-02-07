package StructuralDesignPatterns.Facade.subsystems.impl;

import StructuralDesignPatterns.Facade.subsystems.SoundSystem;

public class SoundSystemImpl implements SoundSystem {
    @Override
    public void setVolume(int volume) {
        System.out.println("Set volume to : " + volume);
    }

    @Override
    public void turnOn() {
        System.out.println("Sound is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sound is OFF");
    }
}