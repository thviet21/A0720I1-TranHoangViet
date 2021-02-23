package service.impl;

import dao.IRoomDAO;
import dao.impl.RoomDAOImpl;
import model.Room;
import service.IServiceRoom;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRoomImpl implements IServiceRoom {
    IRoomDAO roomDAO = new RoomDAOImpl();
    @Override
    public List<Room> findAll() {
        List<Room> roomList = new ArrayList<>();
        try{
            roomList = roomDAO.getAllRoom();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    @Override
    public void save(Room room) {
        try{
            roomDAO.insertRoom(room);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Room findById(int id) {
        Room room = null;
        try{
            room = roomDAO.getRoom(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return room;
    }

    @Override
    public void update(Room room) {
        try{
            roomDAO.updateRoom(room);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try{
            roomDAO.deleteRoom(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Room> findByName(String name) {
        List<Room> roomList = new ArrayList<>();
        try{
            roomList = roomDAO.findRoom(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
