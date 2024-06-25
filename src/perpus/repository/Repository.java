/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package perpus.repository;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kevinramadha
 * @param <T>
 */
public interface Repository<T> {
    public List<T> getList()throws SQLException;
    public void insert(T t)throws SQLException;
    public void update(T t)throws SQLException;
    public void delete(T t)throws SQLException;
}
