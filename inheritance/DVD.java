/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;



import java.util.Objects;

/**
 *
 * @author Alexis
 */
public class DVD extends Item{
    
     private String videoNumber;
     private double duration;
     private boolean closedCaptions; 

    /**
     *
     * @return
     */
    public String getVideoNumber() {
        return videoNumber;
    }

    /**
     *
     * @return
     */
    public double getDuration() {
        return duration;
    }

    /**
     *
     * @return
     */
    public boolean isClosedCaptions() {
        return closedCaptions;
    }

    /**
     *
     * @param videoNumber
     */
    public void setVideoNumber(String videoNumber) {
        this.videoNumber = videoNumber;
    }

    /**
     *
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     *
     * @param closedCaptions
     */
    public void setClosedCaptions(boolean closedCaptions) {
        this.closedCaptions = closedCaptions;
    }

    public DVD(int itemID,String title,String genre, String targetAudience,boolean closedCaptions,String videoNumber, double duration, boolean available) {
        super(itemID, title, genre, targetAudience, available);
        this.videoNumber = videoNumber;
        this.duration = duration;
        this.closedCaptions = closedCaptions;
    }
    
   
    public DVD(DVD d){
        super(d);
        this.closedCaptions = d.closedCaptions;
        this.videoNumber = d.videoNumber;
        this.duration = d.duration;
        
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVD other = (DVD) obj;
        if (Double.doubleToLongBits(this.duration) != Double.doubleToLongBits(other.duration)) {
            return false;
        }
        if (this.closedCaptions != other.closedCaptions) {
            return false;
        }
        if (!Objects.equals(this.videoNumber, other.videoNumber)) {
            return false;
        }
        return true;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "DVD{" + "videoNumber=" + videoNumber + ", duration=" + duration + ", closedCaptions=" + closedCaptions + '}';
    }
     
     

}
