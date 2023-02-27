/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_arrangement;

/**
 *
 * @author Tech
 */
public class Rooms {
    private String roomNo,roomSize,floorNo;
    
    public Rooms(String roomNo,String roomSize,String floorNo){
    this.roomNo=roomNo;
    this.roomSize=roomSize;
    this.floorNo=floorNo;
    }
    public String getRoomNo(){
    return roomNo;
    }
    public String getRoomSize(){
    return roomSize;
    }
    public String getFloorNo(){
    return floorNo;
    }
    public void setRoomNo(String roomNo){
    roomNo=roomNo;
    }
     public void setRoomSize(String roomSize){
    roomSize=roomSize;
    }
      public void setFloorNo(String FloorNo){
    floorNo=floorNo;
    }
    
}
