
package seating_arrangement;

/**
 *
 * @author Tech
 */
public class BookRooms {
    private String floorNo,roomNo,roomSize;
    
    public BookRooms(String floorNo, String roomNo,String roomSize){
    this.floorNo=floorNo;
    this.roomNo=roomNo;
    this.roomSize=roomSize;
    }
    public String getFloorNo(){
    return floorNo;
    }
    public String getRoomNo(){
    return roomNo;
    }
    public String getRoomSize(){
    return roomSize;
    }
    public void setFloorNo(String floorNo){
    this.floorNo=floorNo;
    }
    public void setRoomNo(String roomNo){
    this.roomNo=roomNo;
    }
    public void setRoomSize(String roomSize){
    this.roomSize=roomSize;
    }
}
