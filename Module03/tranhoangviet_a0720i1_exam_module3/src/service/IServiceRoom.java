package service;

import model.Room;

import java.util.List;

public interface IServiceRoom {
    List<Room> findAll();

    void save(Room room);

    Room findById(int id);

    void update( Room room);

    void remove(int id);

    List<Room> findByName(String name);
}
