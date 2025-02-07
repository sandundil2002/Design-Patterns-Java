package StructuralDesignPatterns.Facade.facade;

import StructuralDesignPatterns.Facade.subsystems.DVDPlayer;
import StructuralDesignPatterns.Facade.subsystems.SoundSystem;
import StructuralDesignPatterns.Facade.subsystems.TvSystem;
import StructuralDesignPatterns.Facade.subsystems.impl.DVDPlayerImpl;
import StructuralDesignPatterns.Facade.subsystems.impl.SoundSystemImpl;
import StructuralDesignPatterns.Facade.subsystems.impl.TvSystemImpl;

public class HomeTheaterFacade implements HomeTheater {
    private final TvSystem tvSystem;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        tvSystem = new TvSystemImpl();
        soundSystem = new SoundSystemImpl();
        dvdPlayer = new DVDPlayerImpl();
    }

    @Override
    public void watchMovie(String movieName) {
        tvSystem.turnOn();
        tvSystem.setChannel(5);

        soundSystem.turnOn();
        soundSystem.setVolume(20);

        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movieName);
    }

    @Override
    public void stopMovie() {
        dvdPlayer.turnOff();
        tvSystem.turnOn();
        soundSystem.turnOff();
    }
}