package dao.impl;

import dao.IRoomDAO;
import model.Room;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAOImpl implements IRoomDAO {
    private static final String INSERT_ROOM_SQL = "INSERT INTO room (namecustomer, telephonenumber, startdayrent, idtypePay, description) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_ROOM_BY_ID = "Select * from room where idRoom = ?";
    private static final String SELECT_ALL_ROOM = "Select * from room order by idRoom";
    private static final String DELETE_ROOM_BY_ID = "Delete from room where idRoom = ?";
    private static final String UPDATE_ROOM = "Update room set namecustomer = ?, telephonenumber = ?, startdayrent = ?, idtypePay = ?, description = ? where idRoom = ?";
    private static final String SELECT_ROOM_BY_NAME = "Select * from room where namecustomer = ?";


    @Override
    public void insertRoom(Room room) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ROOM_SQL);
        preparedStatement.setString(1, room.getNameCustomer());
        preparedStatement.setString(2, room.getTelephoneNumberCustomer());
        preparedStatement.setString(3, room.getStartDayRent());
        preparedStatement.setInt(4, room.getTypePay());
        preparedStatement.setString(5, room.getDescription());

        preparedStatement.executeUpdate();
    }

    @Override
    public Room getRoom(int id) throws SQLException {
        Room room = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ROOM_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int idRoom = resultSet.getInt("idRoom");
            String nameCustomer = resultSet.getString("namecustomer");
            String telephoneNumber = resultSet.getString("telephonenumber");
            String startDayRent = resultSet.getString("startdayrent");
            int idTypePay = resultSet.getInt("idtypePay");
            String description = resultSet.getString("description");
            room = new Room(idRoom,nameCustomer,telephoneNumber,startDayRent,idTypePay,description);
        }
        return room;
    }

    @Override
    public List<Room> getAllRoom() throws SQLException {
        List<Room> roomList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ROOM);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idRoom = resultSet.getInt("idRoom");
            String nameCustomer = resultSet.getString("namecustomer");
            String telephoneNumber = resultSet.getString("telephonenumber");
            String startDayRent = resultSet.getString("startdayrent");
            int idTypePay = resultSet.getInt("idtypePay");
            String description = resultSet.getString("description");
            roomList.add(new Room(idRoom, nameCustomer, telephoneNumber, startDayRent, idTypePay, description));
        }
        return roomList;
    }

    @Override
    public boolean deleteRoom(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ROOM_BY_ID);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateRoom(Room room) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ROOM);
        preparedStatement.setString(1, room.getNameCustomer());
        preparedStatement.setString(2, room.getTelephoneNumberCustomer());
        preparedStatement.setString(3, room.getStartDayRent());
        preparedStatement.setInt(4, room.getTypePay());
        preparedStatement.setString(5, room.getDescription());
        preparedStatement.setInt(6, room.getIdRoom());
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public List<Room> findRoom(String name) throws SQLException {
        List<Room> roomList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ROOM_BY_NAME);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idRoom = resultSet.getInt("idRoom");
            String nameCustomer = resultSet.getString("namecustomer");
            String telephoneNumber = resultSet.getString("telephonenumber");
            String startDayRent = resultSet.getString("startdayrent");
            int idTypePay = resultSet.getInt("idtypePay");
            String description = resultSet.getString("description");
            roomList.add(new Room(idRoom, nameCustomer, telephoneNumber, startDayRent, idTypePay, description));
        }
        return roomList;
    }
}
