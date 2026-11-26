package rental.model;

// 이용 기록 1건 (반납할 때 만들어지고, 만든 뒤에는 바뀌지 않는다)
public class Rental {
    private final String memberName;
    private final String vehicleType;
    private final String vehicleId;
    private final int minutes;
    private final int fee;

    public Rental(Member member, Vehicle vehicle, int minutes, int fee) {
        this.memberName = member.getName();
        this.vehicleType = vehicle.typeName();
        this.vehicleId = vehicle.getId();
        this.minutes = minutes;
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return memberName + " | " + vehicleType + " " + vehicleId + " | " + minutes + "분 | " + fee + "원";
    }
}
