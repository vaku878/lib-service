package dao;

import dto.Language;
import util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LanguageDAOImpl implements LanguageDAO {
    @Override
    public int create(Language language) {
        int result;
        try(Connection connection = DB.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO ls_lang VALUES (?, ?)");
            statement.setObject(1, language.getId());
            statement.setString(2, language.getName());
            result = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public Language read(int id) {
        return null;
    }

    @Override
    public int update(Language language) {
        return 0;
    }

    @Override
    public int delete(Language language) {
        return 0;
    }
}
