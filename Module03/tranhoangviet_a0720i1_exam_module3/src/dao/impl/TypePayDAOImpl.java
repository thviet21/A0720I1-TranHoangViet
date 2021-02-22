package dao.impl;

import dao.ITypePay;
import model.Room;
import model.TypePay;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypePayDAOImpl implements ITypePay {
    private static final String INSERT_TYPEPAY_SQL = "INSERT INTO typepay (idtypePay, namePay) VALUES (?, ?)";
    private static final String SELECT_TYPEPAY_BY_ID = "Select * from typepay where idtypePay = ?";
    private static final String SELECT_ALL_TYPEPAY = "Select * from typepay order by idtypePay";
    private static final String DELETE_TYPEPAY_BY_ID = "Delete from typepay where idtypePay = ?";
    private static final String UPDATE_TYPEPAY = "Update typepay set namePay = ? where idRoom = ?";
    private static final String SELECT_TYPEPAY_BY_NAME = "Select * from typepay where namePay = ?";
    @Override
    public void insertTypePay(TypePay typePay) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TYPEPAY_SQL);
        preparedStatement.setInt(1, typePay.getIdPay());
        preparedStatement.setString(2, typePay.getNamePay());

        preparedStatement.executeUpdate();
    }

    @Override
    public TypePay getTypePay(int id) throws SQLException {
        TypePay typePay = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TYPEPAY_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int idTypePay = resultSet.getInt("idtypePay");
            String namePay = resultSet.getString("namePay");
            typePay = new TypePay(idTypePay,namePay);
        }
        return typePay;
    }

    @Override
    public List<TypePay> getAllTypePay() throws SQLException {
        List<TypePay> typePays = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPEPAY);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idTypePay = resultSet.getInt("idtypePay");
            String namePay = resultSet.getString("namePay");
            typePays.add(new TypePay(idTypePay, namePay));
        }
        return typePays;
    }

    @Override
    public boolean deleteTypePay(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTypePay(TypePay typePay) throws SQLException {
        return false;
    }

    @Override
    public List<TypePay> findTypePay(String name) throws SQLException {
        return null;
    }
}
