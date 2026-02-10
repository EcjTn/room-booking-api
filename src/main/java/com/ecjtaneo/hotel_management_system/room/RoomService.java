package com.ecjtaneo.hotel_management_system.room;

import com.ecjtaneo.hotel_management_system.common.dto.MessageResponseDto;
import com.ecjtaneo.hotel_management_system.common.exception.ResourceConflictException;
import com.ecjtaneo.hotel_management_system.common.exception.ResourceNotFoundException;
import com.ecjtaneo.hotel_management_system.room.dto.RoomCreationDto;
import com.ecjtaneo.hotel_management_system.room.model.Room;
import org.springframework.transaction.annotation.Transactional;

public class RoomService {
    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public MessageResponseDto createNewRoom(RoomCreationDto roomCreationDto) {
        if(roomRepository.existsByRoomNumber(roomCreationDto.roomNumber())) throw new ResourceConflictException("Room already exists");

        return new MessageResponseDto("Room successfully created.");
    }

    public Room findByRoomNumber(String roomNumber) {
        return roomRepository.findByRoomNumber(roomNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found"));
    }

    @Transactional
    public void deleteByRoomNumber(String roomNumber) {
        roomRepository.deleteByRoomNumber(roomNumber);
    }

}
