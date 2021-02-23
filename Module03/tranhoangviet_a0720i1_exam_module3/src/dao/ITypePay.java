package dao;

import model.Room;
import model.TypePay;

import java.sql.SQLException;
import java.util.List;

public interface ITypePay {
    void insertTypePay(TypePay typePay) throws SQLException;

    TypePay getTypePay(int id) throws SQLException;

    List<TypePay> getAllTypePay() throws SQLException;

    boolean deleteTypePay(int id) throws SQLException;

    boolean updateTypePay(TypePay typePay) throws SQLException;

    List<TypePay> findTypePay(String name) throws SQLException;
}
