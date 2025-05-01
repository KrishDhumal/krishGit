package com.krish.dao;

import com.krish.pojo.musicPojo;

import java.sql.*;
import java.util.*;

public class musicDaoImpl implements musicDao {

    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String username = "postgres";
    private final String password = "krish1209"; // change to your actual password

    public musicDaoImpl() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public void save(musicPojo a) {
        String sql = "INSERT INTO albums (title, artist, genre, rating) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getTitle());
            ps.setString(2, a.getArtist());
            ps.setString(3, a.getGenre());
            ps.setDouble(4, a.getRating());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<musicPojo> list() {
        List<musicPojo> list = new ArrayList<>();
        String sql = "SELECT * FROM albums";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new musicPojo(
                        rs.getString("title"),
                        rs.getString("artist"),
                        rs.getString("genre"),
                        rs.getDouble("rating")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Optional<musicPojo> findByTitle(String title) {
        String sql = "SELECT * FROM albums WHERE title = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, title);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new musicPojo(
                            rs.getString("title"),
                            rs.getString("artist"),
                            rs.getString("genre"),
                            rs.getDouble("rating")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public Optional<musicPojo> findByArtist(String artist) {
        String sql = "SELECT * FROM albums WHERE artist = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, artist);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new musicPojo(
                            rs.getString("title"),
                            rs.getString("artist"),
                            rs.getString("genre"),
                            rs.getDouble("rating")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<musicPojo> findAlbumsByTitle(String title) {
        List<musicPojo> list = new ArrayList<>();
        String sql = "SELECT * FROM albums WHERE title = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, title);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(new musicPojo(
                            rs.getString("title"),
                            rs.getString("artist"),
                            rs.getString("genre"),
                            rs.getDouble("rating")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<musicPojo> findByGenre(String genre) {
        List<musicPojo> list = new ArrayList<>();
        String sql = "SELECT * FROM albums WHERE genre = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, genre);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(new musicPojo(
                            rs.getString("title"),
                            rs.getString("artist"),
                            rs.getString("genre"),
                            rs.getDouble("rating")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void delete(musicPojo a) {
        String sql = "DELETE FROM albums WHERE title = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getTitle());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
