package com.ecjtaneo.hotel_management_system.room;

import com.ecjtaneo.hotel_management_system.room.model.Room;
import com.ecjtaneo.hotel_management_system.room.model.RoomStatus;
import com.ecjtaneo.hotel_management_system.room.model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    public boolean existsByRoomNumber(String roomNumber);

    public Optional<Room> findByRoomNumber(String roomNumber);

    public void deleteByRoomNumber(String roomNumber);

    public List<Room> findTop10ByOrderByIdDesc();

    public List<Room> findTop10ByIdLessThanOrderByIdDesc(Long lastSeenId);

    public List<Room> findTop10ByStatusAndType(RoomStatus status, RoomType type);

    public List<Room> findTop10ByStatusAndTypeAndIdLessThanOrderByIdDesc(Long lastSeenId, RoomStatus status, RoomType type);

    public void updateStatusByRoomNumber(String roomNumber, RoomStatus status);

    public Optional<Room> findByRoomNumberAndStatus(String roomNumber, RoomStatus status);
}
