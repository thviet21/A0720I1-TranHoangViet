package dao;

import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface IRoomDAO {
    void insertRoom(Room room) throws SQLException;

    Room getRoom(int id) throws SQLException;

    List<Room> getAllRoom() throws SQLException;

    boolean deleteRoom(int id) throws SQLException;

    boolean updateRoom(Room room) throws SQLException;

    List<Room> findRoom(String name) throws SQLException;
}
