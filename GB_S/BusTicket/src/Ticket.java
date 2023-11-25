import java.text.DecimalFormat;
import java.util.Date;


public class Ticket {

    private long Id;
    private int DepartureZone;
    private int ArrivalZone;
    private Date DepartureTime;
    private Date ArrivalTime;
    private long BuyerId;
    private boolean isUsed;
    public DecimalFormat Price;
    public String Place;
    
        public Ticket(long id, int departureZone, int arrivalZone, Date departureTime, 
            Date arrivalTime, long buyerId,
            boolean isUsed, DecimalFormat price, String place) {
        this.Id = id;
        this.DepartureZone = departureZone;
        this.ArrivalZone = arrivalZone;
        this.DepartureTime = departureTime;
        this.ArrivalTime = arrivalTime;
        this.BuyerId = buyerId;
        this.isUsed = isUsed;
        this.Price = price;
        this.Place = place;

    }

    
        public long getId() {
            return Id;
        }

        public void setId(long id) {
            Id = id;
        }

        public int getDepartureZone() {
            return DepartureZone;
        }

        public void setDepartureZone(int departureZone) {
            DepartureZone = departureZone;
        }

        public int getArrivalZone() {
            return ArrivalZone;
        }

        public void setArrivalZone(int arrivalZone) {
            ArrivalZone = arrivalZone;
        }

        public Date getDepartureTime() {
            return DepartureTime;
        }

        public void setDepartureTime(Date departureTime) {
            DepartureTime = departureTime;
        }

        public Date getArrivalTime() {
            return ArrivalTime;
        }

        public void setArrivalTime(Date arrivalTime) {
            ArrivalTime = arrivalTime;
        }

        public long getBuyerId() {
            return BuyerId;
        }

        public void setBuyerId(long buyerId) {
            BuyerId = buyerId;
        }

        public boolean isUsed() {
            return isUsed;
        }

        public void setUsed(boolean isUsed) {
            this.isUsed = isUsed;
        }

        public DecimalFormat getPrice() {
            return Price;
        }

        public void setPrice(DecimalFormat price) {
            Price = price;
        }

        public String getPlace() {
            return Place;
        }

        public void setPlace(String place) {
            Place = place;
        }


    
}
