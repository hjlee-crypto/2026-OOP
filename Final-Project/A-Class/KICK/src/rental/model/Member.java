package rental.model;

import java.util.Objects;

// 회원: 지금 빌린 기기를 하나 기억한다
public class Member {
    private final String id;
    private final String name;
    private Vehicle current;        // 대여 중인 기기 (없으면 null)

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Vehicle getCurrent() { return current; }
    public void setCurrent(Vehicle current) { this.current = current; }

    // 회원번호가 같으면 같은 회원
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Member)) return false;
        return Objects.equals(id, ((Member) obj).id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
