package week12;

import java.util.ArrayList;
import java.util.List;

public class Class12_13_1_House_OOP {
    public static void main(String[] args) {

    }
}

class House {
    private String address;
    private List<Room> rooms;

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoom(int roomNumber) {

        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }

        }
        return null;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}

class Room{
private int roomNumber;
private Door door;
private Window window;

    public Room(int roomNumber, Door door, Window window) {
        if (roomNumber<=0) {
            System.out.println("Room number must be a positive integer.");
        } else {
            this.roomNumber = roomNumber;
        }
        this.door = door;
        this.window = window;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        if (roomNumber>0) {
        this.roomNumber = roomNumber;
        }else {
            System.out.println("Room number must be a positive integer.");
        }
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
}

class Door{
private String color;

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Window{
    private String type;

    public Window(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}